package com.lanhangbao.ecable.entities.bean;

import lombok.Data;

@Data
public class Ec_ip {
    private Long eciId;

    private Long cartId;

    private String cartName;

    private Integer platformType;

    private Integer clientType;

    private Long ip;

    private String ipJson;

    private String obtainIpDesc;

    private Long addTime;

    public Long getEciId() {
        return eciId;
    }

    public void setEciId(Long eciId) {
        this.eciId = eciId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName == null ? null : cartName.trim();
    }

    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public Long getIp() {
        return ip;
    }

    public void setIp(Long ip) {
        this.ip = ip;
    }

    public String getIpJson() {
        return ipJson;
    }

    public void setIpJson(String ipJson) {
        this.ipJson = ipJson == null ? null : ipJson.trim();
    }

    public String getObtainIpDesc() {
        return obtainIpDesc;
    }

    public void setObtainIpDesc(String obtainIpDesc) {
        this.obtainIpDesc = obtainIpDesc == null ? null : obtainIpDesc.trim();
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
}