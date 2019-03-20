package com.xuww.springbootdemo.util;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: xuww
 * @Description: 付款码实体
 * @Date: Created 9:05 2018/5/30.
 * @Modifide BY
 * @Version: 1.0
 */
public class PaymentQrcode implements Serializable {
    private Long id;
    private String loginName;//会员账号
    private Long relationId;//关联ID
    private Date createTime;//创建时间
    private Date finishTime;//失效时间
    private Integer type;//付款码类型
    private Integer isUsed;//是否使用

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }
}
