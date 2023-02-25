package com.lanhangbao.ecable.entities.bean;

public class Eca_login_time {
    private Integer ecaltId;

    private Integer ecaId;

    private String ecaName;

    private Integer loginTime;

    private Long addTime;

    private Long updateTime;

    public Integer getEcaltId() {
        return ecaltId;
    }

    public void setEcaltId(Integer ecaltId) {
        this.ecaltId = ecaltId;
    }

    public Integer getEcaId() {
        return ecaId;
    }

    public void setEcaId(Integer ecaId) {
        this.ecaId = ecaId;
    }

    public String getEcaName() {
        return ecaName;
    }

    public void setEcaName(String ecaName) {
        this.ecaName = ecaName == null ? null : ecaName.trim();
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}