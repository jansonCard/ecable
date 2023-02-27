package com.lanhangbao.ecable.entities.api.apiBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ip {
    private int stateCode;//状态码
    private String reason;//状态说明
    private String ip;//ip
    private String isp;//运营商
    private String zipCode;//邮政编码
    private String areaCode;//区号
    private String country;//所在国家
    private String province;//所在省份、州
    private String city;//所在的城市
    private String district;//所在的地区
}
