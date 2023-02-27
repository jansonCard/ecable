package com.lanhangbao.ecable.entities.api.apiBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IpObj {
    private int StateCode;//状态码
    private String Reason;//状态说明
    private Ip Result;
}
