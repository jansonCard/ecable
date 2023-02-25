package com.lanhangbao.ecable.entities.bean;

public class Eca_login {
    private Integer ecalId;

    private Integer ecaId;

    private Integer clientType;

    private Integer loginType;

    private String tokenName;

    private String tokenString;

    private String phoneStr;

    private Long effectTime;

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

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
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

    public String getPhoneStr() {
        return phoneStr;
    }

    public void setPhoneStr(String phoneStr) {
        this.phoneStr = phoneStr == null ? null : phoneStr.trim();
    }

    public Long getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Long effectTime) {
        this.effectTime = effectTime;
    }
}