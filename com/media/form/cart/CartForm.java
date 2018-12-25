package com.media.form.cart;


import java.math.BigDecimal;
import java.util.Date;

import com.media.common.base.BaseForm;

/**
 * Created by lihaiqiang on 2018/04/14.
 */
public class CartForm extends BaseForm {
    private String id;

    private String userId;

    private Integer goodsCount;

    private BigDecimal totalPrice;

    private BigDecimal disPrice;

    private BigDecimal realTotalPrice;

    private Integer status;

    private Date createTime;

    private String createUserId;

    private Date lastModifyTime;

    private String lastModifyUserId;

    private String areaId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getDisPrice() {
        return disPrice;
    }

    public void setDisPrice(BigDecimal disPrice) {
        this.disPrice = disPrice;
    }

    public BigDecimal getRealTotalPrice() {
        return realTotalPrice;
    }

    public void setRealTotalPrice(BigDecimal realTotalPrice) {
        this.realTotalPrice = realTotalPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    @Override
    public String toString() {
        return "CartForm{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", goodsCount=" + goodsCount +
                ", totalPrice=" + totalPrice +
                ", disPrice=" + disPrice +
                ", realTotalPrice=" + realTotalPrice +
                ", status=" + status +
                ", createTime=" + createTime +
                ", createUserId='" + createUserId + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                ", lastModifyUserId='" + lastModifyUserId + '\'' +
                ", areaId='" + areaId + '\'' +
                '}';
    }
}
