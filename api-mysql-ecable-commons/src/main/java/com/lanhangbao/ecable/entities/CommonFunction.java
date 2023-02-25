package com.lanhangbao.ecable.entities;


import com.google.gson.Gson;
import com.lanhangbao.ecable.entities.zhutong.SendMessage;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CommonFunction {
    /*获取ip*/
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)){
            if (ip.contains(",")) {
                ip = ip.split(",")[0];
            }
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip.equals("0:0:0:0:0:0:0:1")) {
            ip = "127.0.0.1";
        }
        return ip;
    }
    /*将127.0.0.1形式的IP地址转换成十进制整数，这里没有进行任何错误处理  */
    public static long ipToLong(String strIp) {
        long[] ip = new long[4];
        // 先找到IP地址字符串中.的位置
        int position1 = strIp.indexOf(".");
        int position2 = strIp.indexOf(".", position1 + 1);
        int position3 = strIp.indexOf(".", position2 + 1);
        // 将每个.之间的字符串转换成整型
        ip[0] = Long.parseLong(strIp.substring(0, position1));
        ip[1] = Long.parseLong(strIp.substring(position1 + 1, position2));
        ip[2] = Long.parseLong(strIp.substring(position2 + 1, position3));
        ip[3] = Long.parseLong(strIp.substring(position3 + 1));
        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
    }
    /* 将十进制整数形式转换成127.0.0.1形式的IP地址  */
    public static String longToIp(long longIp) {
        // 直接右移24位
        String sb = "" + String.valueOf((longIp >>> 24)) +
                "." +
                // 将高8位置0，然后右移16位
                String.valueOf((longIp & 0x00FFFFFF) >>> 16) +
                "." +
                // 将高16位置0，然后右移8位
                String.valueOf((longIp & 0x0000FFFF) >>> 8) +
                "." +
                // 将高24位置0
                String.valueOf((longIp & 0x000000FF));
        return sb;
    }
    /*md5加密*/
    public static String md5(String content) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(content.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("NoSuchAlgorithmException", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException", e);
        }
        StringBuilder hex = new StringBuilder(hash.length * 2); byte b; int i; byte[] arrayOfByte1;
        for (i = (arrayOfByte1 = hash).length, b = 0; b < i; ) { byte b1 = arrayOfByte1[b];
            if ((b1 & 0xFF) < 16) {
                hex.append("0");
            }
            hex.append(Integer.toHexString(b1 & 0xFF)); b++; }
        return hex.toString();
    }
    /*设置session*/
    public static void setSession(HttpServletRequest request, String session_name, String session_value, int time) {
        HttpSession session = request.getSession();
        session.setAttribute(session_name, session_value);
        session.setMaxInactiveInterval(time);
    }
    /*获取session*/
    public static String getSession(HttpServletRequest request, String session_name) {
        HttpSession session = request.getSession();
        String sessionName = (String)session.getAttribute(session_name);
        return sessionName;
    }
    /*设置cookie*/
    public static void setCookie(HttpServletResponse response, String cookie_name, String cookie_value, int time)
    {
        Cookie cookName =new Cookie(cookie_name, cookie_value);
        cookName.setMaxAge(time);//设置cookie的最大生命周期为7天
        cookName.setPath("/"); //设置路径为全路径（这样写的好处是同项目下的页面都能访问该cookie
        response.addCookie(cookName); //response是HttpServletResponse类型
    }
    /*获取cookie*/
    public static String getCookie(HttpServletRequest request, String cookie_name) {
        String cookie_value = "0";
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            byte b; int i; Cookie[] arrayOfCookie; for (i = (arrayOfCookie = cookies).length, b = 0; b < i; ) {
                Cookie cookie = arrayOfCookie[b];
                if (cookie.getName().equals(cookie_name))
                    cookie_value = cookie.getValue();
                b++;
            }
        } else {
            cookie_value = "0";
        }
        return cookie_value;
    }
    /*获取gson*/
    public static Gson getGson() {
        Gson gson = new Gson();
        return gson;
    }
    /*登录发送验证码内容*/
    public static void send_admin_login(String phone, String code) {
        String content = "【缆行宝】尊敬的管理员您好，您正在登录缆行宝管理平台，您的验证码为："+ code +",请勿向他人泄漏。";

        SendMessage.sendSms(phone,content,code);
    }
    /*获取随机数*/
    public static int getRandom(int min, int max) {
        int number = 0;
        Random random = new Random();
        number = random.nextInt(max) % (max - min + 1) + min;
        return number;
    }
    /*getLockTime*/
    public static int getLockTime(String lock_name)
    {
        int lock_time = 0;
        switch(lock_name)
        {
            case "5分钟":
                lock_time = 5*60;
                break;
            case "10分钟":
                lock_time = 10*60;
                break;
            case "20分钟":
                lock_time = 20*60;
                break;
            case "30分钟":
                lock_time = 30*60;
                break;
            case "1小时":
                lock_time = 60*60;
                break;
            case "2小时":
                lock_time = 2*60*60;
                break;
            case "4小时":
                lock_time = 4*60*60;
                break;
            case "8小时":
                lock_time = 8*60*60;
                break;
            case "12小时":
                lock_time = 12*60*60;
                break;
            case "16小时":
                lock_time = 16*60*60;
                break;
            case "24小时":
                lock_time = 24*60*60;
                break;
        }
        return lock_time;
    }
    /*login_time*/
    public static int getLoginTime(String login_name)
    {
        int login_time = 0;
        switch(login_name)
        {
            case "1小时":
                login_time = 60*60;
                break;
            case "2小时":
                login_time = 2*60*60;
                break;
            case "4小时":
                login_time = 4*60*60;
                break;
            case "8小时":
                login_time = 8*60*60;
                break;
            case "12小时":
                login_time = 12*60*60;
                break;
            case "16小时":
                login_time = 16*60*60;
                break;
            case "24小时":
                login_time = 24*60*60;
                break;
        }
        return login_time;
    }
    /*getPlatformName*/
    public static String getPlatformName() {
        String p_name = "缆行宝管理平台";
        return p_name;
    }
    /*getCompanyName*/
    public static String getCompanyName() {
        String c_name = "北京谨菘科技有限公司";
        return c_name;
    }
    /*getCookieTime*/
    public static int getCookieTime(int type_id) {
        int cookie_time = 0;
        if (type_id == 1) {
            cookie_time = 2592000;
        }else if(type_id == 2) {
            cookie_time = 86400;
        }
        return cookie_time;
    }
    /*时间戳转时间*/
    public static String stampToTime(Long time) {
        Date date = new Date(time.longValue());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time_str = sdf.format(date);
        return time_str;
    }
    /*判断字符串是否为数字*/
    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    /*getNowData 获取本年年份本月月份*/
    public static int getNowData(int type_id) {
        int now_data = 0;
        Calendar cal = Calendar.getInstance();
        if(type_id == 1) {//当前年份
            now_data =  cal.get(Calendar.YEAR);
        }else if(type_id == 2){//当前月份
            now_data =  cal.get(Calendar.MONTH);
        }
        return now_data;
    }
    //日期转时间戳
    public static long dateToStamp(String s){
        long res;
        //设置时间模版
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long ts = date.getTime();
        res = ts;
        return res;
    }
    /*getMonthDay 获取本月第一天和最后一天*/
    public static String getMonthDay(String date_str,int type_id) throws ParseException
    {
        String month_day = "";
        Calendar cale = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        if(type_id == 1) {
            cale.setTime(formatter.parse(date_str));
            cale.add(Calendar.MONTH, 0);
            cale.set(Calendar.DAY_OF_MONTH, 1);
            String firstDayOfMonth = formatter.format(cale.getTime()); // 当月第一天 2019-02-01
            month_day = firstDayOfMonth;
        }else if(type_id == 2){
            cale.setTime(formatter.parse(date_str));
            cale.add(Calendar.MONTH, 1);
            cale.set(Calendar.DAY_OF_MONTH, 0);
            String lastDayOfMonth = formatter.format(cale.getTime()); // 当月最后一天 2019-02-28
            month_day = lastDayOfMonth;
        }
        return month_day;
    }
    /*登录过期时间*/
    public static long getLoginExpirationTime()
    {
        long login_expiration_time = 86400000L;
        return login_expiration_time;
    }
    /*获取用户名前缀，用于注册时用*/
    public static String getUsernamePrefix() {
        String username_prefix = "LANHANGBAO";
        return username_prefix;
    }

}
