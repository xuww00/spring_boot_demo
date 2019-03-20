package com.xuww.springbootdemo.util;

import java.io.Serializable;

/**
 * @Author: xuww
 * @Description:
 * @Date: Created 11:41 2018/9/19.
 * @Modifide BY
 * @Version: 1.0
 */
public class MobilePrefix implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String country; //国家
    private String mobilePrefix;//区号
    private String area;//洲
    private String pingyin;

    public String getPingyin() {
        return pingyin;
    }

    public void setPingyin(String pingyin) {
        this.pingyin = pingyin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMobilePrefix() {
        return mobilePrefix;
    }

    public void setMobilePrefix(String mobilePrefix) {
        this.mobilePrefix = mobilePrefix;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
