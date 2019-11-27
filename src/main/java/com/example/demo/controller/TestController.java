package com.example.demo.controller;

import com.example.demo.eneity.Area;
import com.example.demo.eneity.User;
import com.example.demo.service.AreaService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @author:guokk
 * @date: 2019-11-11
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;
    @Autowired
    private AreaService areaService;

    @GetMapping("detail")
    public Object detail(Long id){
        User user = userService.detail(id);
        Area area = areaService.detail(id);
        Map<String, Object> map = new HashMap<>();
        map.put(user.getUsername(),user);
        map.put(area.getAreaName(),area);
        return map;
    }
}
