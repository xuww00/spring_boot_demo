package com.xuww.springbootdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.xuww.springbootdemo.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 20:07 2018/11/24.
 * @Modifide BY
 * @Version: 1.0
 */
@Controller
@RequestMapping("/api/")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/init")
    @ResponseBody
    public Object get(String type){
        String BaseUrl;
        String BaseUrlApi;
        if ("sat".equals(type)){
            BaseUrl = "http://user.ipaye.cn";
            BaseUrlApi = "http://api.ipaye.cn";
        }else {
            BaseUrl = "http://test-user.ipaye.cn";
            BaseUrlApi = "http://test-api.ipaye.cn";
        }
        String yunpay_wap = "/yunpay_wap/app!300100/m1/v0";
        String yunpay_jobs = "/yunpay_jobs/app!300100/m1/v0";
        String yunpay_admin_v3 = "/yunpay_admin_v3/api/web/dictTable/initDict";
        String yunpay_v2 = "/yunpay_v2/api/web/dictTable/initDict";
        String yunpay_static = "/yunpay_static/wap/dictTable/initDict";
        String yunpay_service = "/api/v2/dictTable/initDict";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("yunpay_wap",sendGet(BaseUrl+yunpay_wap, ""));
        jsonObject.put("yunpay_jobs",sendGet(BaseUrl+yunpay_jobs, ""));
        jsonObject.put("yunpay_admin_v3",sendGet(BaseUrl+yunpay_admin_v3, ""));
        jsonObject.put("yunpay_v2",sendGet(BaseUrl+yunpay_v2, ""));
        jsonObject.put("yunpay_static",sendGet(BaseUrl+yunpay_static, ""));
        jsonObject.put("yunpay_service",sendGet(BaseUrlApi+yunpay_service, ""));
        return jsonObject.toJSONString();
    }

    @RequestMapping("/jdbcTest")
    @ResponseBody
    @Test
    public void jdbcTest(){
        final String sql = "select count(*)  from fc_user";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("数据总数：" + count);
        return ;
    }

    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
//            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
//            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }
}
