package com.xuww.springbootdemo.entity;


import java.util.Date;

public class YUser {

    private Integer id;


    private String loginName;

    /*
    * 手机号
    */

    private String mobile;

    /*
    * 用户密码
    */

    private String password;

    /*
    * 支付密码
    */

    private String payPwd;

    /*
    * 会员状态：1已审核；11资金冻结；21账号冻结；22黑名单；23删除到回收站；
    */
    private Integer status;

    /*
    * 最后登录的唯一标识
    */
    private String lastLoginIf;

    /*
    * 指纹密码
    */
    private String fingerprint;

    /*
    * 指纹密码对应的标识
    */
    private String fingerprintIf;

    /*
    * 是否启用小额免密，0否1是
    */
    private Integer dribletPayAvoid;

    /*
    * 小额金额
    */
    private Integer dribletPayAmount;

    /*
    * 小额日上限
    */
    private Integer dribletPayLimit;

    /*
    * 免密支付唯一标识码
    */
    private String dribletPayIf;

    private Date lastLoginTime;

    public Integer getId() {
        return id;
    }

    /**
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    /**
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPassword() {
        return password;
    }

    /**
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPayPwd() {
        return payPwd;
    }

    /**
     * @param payPwd 支付密码
     */
    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd == null ? null : payPwd.trim();
    }

    public Integer getStatus() {
        return status;
    }

    /**
     * @param status 会员状态：1已审核；11资金冻结；21账号冻结；22黑名单；23删除到回收站；
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLastLoginIf() {
        return lastLoginIf;
    }

    /**
     * @param lastLoginIf 最后登录的唯一标识
     */
    public void setLastLoginIf(String lastLoginIf) {
        this.lastLoginIf = lastLoginIf == null ? null : lastLoginIf.trim();
    }

    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * @param fingerprint 指纹密码
     */
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint == null ? null : fingerprint.trim();
    }

    public String getFingerprintIf() {
        return fingerprintIf;
    }

    /**
     * @param fingerprintIf 指纹密码对应的标识
     */
    public void setFingerprintIf(String fingerprintIf) {
        this.fingerprintIf = fingerprintIf == null ? null : fingerprintIf.trim();
    }

    public Integer getDribletPayAvoid() {
        return dribletPayAvoid;
    }

    /**
     * @param dribletPayAvoid 是否启用小额免密，0否1是
     */
    public void setDribletPayAvoid(Integer dribletPayAvoid) {
        this.dribletPayAvoid = dribletPayAvoid;
    }

    public Integer getDribletPayAmount() {
        return dribletPayAmount;
    }

    /**
     * @param dribletPayAmount 小额金额
     */
    public void setDribletPayAmount(Integer dribletPayAmount) {
        this.dribletPayAmount = dribletPayAmount;
    }

    public Integer getDribletPayLimit() {
        return dribletPayLimit;
    }

    /**
     * @param dribletPayLimit 小额日上限
     */
    public void setDribletPayLimit(Integer dribletPayLimit) {
        this.dribletPayLimit = dribletPayLimit;
    }

    public String getDribletPayIf() {
        return dribletPayIf;
    }

    /**
     * @param dribletPayIf 免密支付唯一标识码
     */
    public void setDribletPayIf(String dribletPayIf) {
        this.dribletPayIf = dribletPayIf == null ? null : dribletPayIf.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime null
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}