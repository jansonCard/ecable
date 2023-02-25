package com.lanhangbao.mysql.ecable.bean;

import lombok.Data;

@Data
public class Ec_admin {
    private Integer ecaId;

    private String ecaName;

    private String ecaPhone;

    private String ecaPwd;

    private Boolean startType;

    private Integer adminType;

    private Long addTime;

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

    public String getEcaPhone() {
        return ecaPhone;
    }

    public void setEcaPhone(String ecaPhone) {
        this.ecaPhone = ecaPhone == null ? null : ecaPhone.trim();
    }

    public String getEcaPwd() {
        return ecaPwd;
    }

    public void setEcaPwd(String ecaPwd) {
        this.ecaPwd = ecaPwd == null ? null : ecaPwd.trim();
    }

    public Boolean getStartType() {
        return startType;
    }

    public void setStartType(Boolean startType) {
        this.startType = startType;
    }

    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}