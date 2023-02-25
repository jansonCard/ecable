package com.lanhangbao.ecable.entities.zhutong;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;
import org.springframework.http.MediaType;

public class SendMessage {
    public static void sendSms(String phone,String content, String code) {
        String urls = "https://api.mix2.zthysms.com/v2/sendSms";
        long tKey = System.currentTimeMillis() / 1000;
        JSONObject json = new JSONObject();
        json.put("username", "greatwyh369");//账号
        json.put("password", SecureUtil.md5(SecureUtil.md5("Snynitfqm01") + tKey));//密码
        json.put("tKey", tKey + ""); // //tKey
        json.put("mobile", phone); //手机号
        json.put("content", content); //内容
        String result = HttpRequest.post(urls)
                .timeout(60000)
                .body(json.toString(), MediaType.APPLICATION_JSON_UTF8_VALUE)
                .execute()
                .body();
        System.out.println(result);
    }
}
