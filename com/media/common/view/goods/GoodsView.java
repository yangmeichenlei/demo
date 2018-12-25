package com.media.common.view.goods;

import java.util.Date;

import com.media.common.model.goods.GoodsBrand;
import com.media.common.model.goods.GoodsClass;
import com.media.common.model.user.User;

public class GoodsView {

    private String goodsId;

    private GoodsBrand goodsBrand;

    private GoodsClass goodsClass;

    private String goodsName;

    private String goodsNameEn;

    private String goodsCode;

    private Integer status;

    private User createUser;

    private Date createTime;

    private User modifyUser;

    private Date lastModifyTime;

    private User auditUser;

    private Date auditTime;

    private String auditOpinion;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public GoodsBrand getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(GoodsBrand goodsBrand) {
        this.goodsBrand = goodsBrand;
    }


    public GoodsClass getGoodsClass() {
        return goodsClass;
    }

    public void setGoodsClass(GoodsClass goodsClass) {
        this.goodsClass = goodsClass;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsNameEn() {
        return goodsNameEn;
    }

    public void setGoodsNameEn(String goodsNameEn) {
        this.goodsNameEn = goodsNameEn;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public User getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(User modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }


    public User getAuditUser() {
        return auditUser;
    }

    public void setAuditUser(User auditUser) {
        this.auditUser = auditUser;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    @Override
    public String toString() {
        return "GoodsView [goodsId=" + goodsId + ", goodsBrand=" + goodsBrand + ", goodsClass=" + goodsClass
                + ", goodsName=" + goodsName + ", goodsNameEn=" + goodsNameEn + ", goodsCode=" + goodsCode + ", status="
                + status + ", createUser=" + createUser + ", createTime=" + createTime + ", modifyUser=" + modifyUser
                + ", lastModifyTime=" + lastModifyTime + ", auditUser=" + auditUser + ", auditTime=" + auditTime
                + ", auditOpinion=" + auditOpinion + "]";
    }


    
}
