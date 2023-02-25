package com.lanhangbao.mysql.ecable.bean;

public class Eca_log {
    private Integer ecalId;

    private Integer ecaId;

    private String ecaName;

    private Integer adminType;

    private Integer clientType;

    private Integer typeId;

    private String description;

    private Long ip;

    private String ipAddress;

    private Long addTime;

    public Integer getEcalId() {
        return ecalId;
    }

    public void setEcalId(Integer ecalId) {
        this.ecalId = ecalId;
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

    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getIp() {
        return ip;
    }

    public void setIp(Long ip) {
        this.ip = ip;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}