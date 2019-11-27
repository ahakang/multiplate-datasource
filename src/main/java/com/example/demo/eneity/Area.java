package com.example.demo.eneity;

import java.io.Serializable;
import java.util.Date;

public class Area implements Serializable {
    private Long id;

    private String areaName;

    private Boolean areaState;

    private String areaConf;

    private String areaConfType;

    private Integer provinceId;

    private String provinceName;

    private Integer cityId;

    private String cityName;

    private Integer districtId;

    private String districtName;

    private Long creatorId;

    private String creatorName;

    private String dtTenant;

    private String dtBrand;

    private Date gmtCreate;

    private Date gmtModified;

    private Date ts;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Boolean getAreaState() {
        return areaState;
    }

    public void setAreaState(Boolean areaState) {
        this.areaState = areaState;
    }

    public String getAreaConf() {
        return areaConf;
    }

    public void setAreaConf(String areaConf) {
        this.areaConf = areaConf == null ? null : areaConf.trim();
    }

    public String getAreaConfType() {
        return areaConfType;
    }

    public void setAreaConfType(String areaConfType) {
        this.areaConfType = areaConfType == null ? null : areaConfType.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getDtTenant() {
        return dtTenant;
    }

    public void setDtTenant(String dtTenant) {
        this.dtTenant = dtTenant == null ? null : dtTenant.trim();
    }

    public String getDtBrand() {
        return dtBrand;
    }

    public void setDtBrand(String dtBrand) {
        this.dtBrand = dtBrand == null ? null : dtBrand.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}