package com.lanhangbao.ecable.entities.bean;

public class Eca_login_log {
    private Integer ecallId;

    private Integer ecaId;

    private String ecaName;

    private Integer adminType;

    private Integer clientType;

    private Integer typeId;

    private String tokenName;

    private String tokenString;

    private Long ip;

    private String ipAddress;

    private Long addTime;

    public Integer getEcallId() {
        return ecallId;
    }

    public void setEcallId(Integer ecallId) {
        this.ecallId = ecallId;
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

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName == null ? null : tokenName.trim();
    }

    public String getTokenString() {
        return tokenString;
    }

    public void setTokenString(String tokenString) {
        this.tokenString = tokenString == null ? null : tokenString.trim();
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