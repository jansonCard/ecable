package com.lanhangbao.ecable.entities.api.apiBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ip {
    private String IP;//ip
    private String Isp;//运营商
    private String ZipCode;//邮政编码
    private String AreaCode;//区号
    private String Country;//所在国家
    private String Province;//所在省份、州
    private String City;//所在的城市
    private String District;//所在的地区
}
