package com.lanhangbao.ecable.entities.api.utils;

import com.lanhangbao.ecable.entities.api.apiBean.Ip;

public class IpFunction {
    //getAllIpAddress 获取全称ip地址
    /***String Isp;//运营商
    //String ZipCode;//邮政编码
    //String AreaCode;//区号
    //String Country;//所在国家
    //String Province;//所在省份、州
    //String City;//所在的城市
    //String District;//所在的地区***/
    public static String getAllIpAddress(Ip ipBean)
    {
        String ipAddress = getCountryName(ipBean) + getProvinceName(ipBean) + getCityName(ipBean) + getDistrictName(ipBean);
        return ipAddress;
    }
    //getSimpleIpAddress获取简单地址
    public static String getSimpleIpAddress(Ip ipBean)
    {
        String ipAddress = getAllIpAddress(ipBean) + "  " + getIspName(ipBean) + getZipCodeName(ipBean) + getAreaCodeName(ipBean);
        return ipAddress;
    }
    //getIspName 运营商
    public static String getIspName(Ip ipBean)
    {
        String ispName = "";
        if(ipBean.getIsp() != null){
            ispName += ipBean.getIsp();
        }
        return ispName;
    }
    //getZipCodeName 邮政编码
    public static String getZipCodeName(Ip ipBean)
    {
        String zipCodeName = "";
        if(ipBean.getZipCode() != null){
            if(ipBean.getIsp() != null){
                zipCodeName += "-";
            }
            zipCodeName += ipBean.getZipCode();
        }
        return zipCodeName;
    }
    //getAreaCodeName 区号
    public static String getAreaCodeName(Ip ipBean)
    {
        String areaCodeName = "";
        if(ipBean.getAreaCode() != null){
            if(ipBean.getZipCode() != null){
                areaCodeName += "-";
            }
            areaCodeName += ipBean.getAreaCode();
        }
        return areaCodeName;
    }
    //getCountryName 国家
    public static String getCountryName(Ip ipBean)
    {
        String countryName = "";
        if(ipBean.getCountry() != null){
            countryName += ipBean.getCountry();
        }
        return countryName;
    }
    //getProvinceName 省
    public static String getProvinceName(Ip ipBean)
    {
        String provinceName = "";
        if(ipBean.getProvince() != null){
            if(ipBean.getCountry() != null){
                provinceName += "-";
            }
            provinceName += ipBean.getProvince();
        }
        return provinceName;
    }
    //getCityName 城市
    public static String getCityName(Ip ipBean)
    {
        String cityName = "";
        if(ipBean.getCity() != null){
            if(ipBean.getProvince() != null){
                cityName += "-";
            }
            cityName += ipBean.getCity();
        }
        return cityName;
    }
    //getDistrictName 地区
    public static String getDistrictName(Ip ipBean)
    {
        String districtName = "";
        if(ipBean.getDistrict() != null){
            if(ipBean.getCity() != null){
                districtName += "-";
            }
            districtName += ipBean.getDistrict();
        }
        return districtName;
    }
}
