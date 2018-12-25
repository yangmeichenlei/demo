package com.media.common.model.goods;

import com.media.common.base.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsSku extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String skuId;

    private String goodsId;

    private String skuName;

    private BigDecimal skuNum;

    private Integer skuUnit;

    private String skuUnitName;

    private BigDecimal price;

    private BigDecimal weight;

    private Integer weightUnit;

    private String weightUnitName;

    private BigDecimal standardWeight;

    private Integer standardWeightUnit;

    private String standardWeightUnitName;

    private String attrIdStr;

    private String attrNameStr;

    private Integer status;

    private String createUserId;

    private Date createTime;

    private String lastModifyUserId;

    private Date lastModifyTime;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public BigDecimal getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(BigDecimal skuNum) {
        this.skuNum = skuNum;
    }

    public Integer getSkuUnit() {
        return skuUnit;
    }

    public void setSkuUnit(Integer skuUnit) {
        this.skuUnit = skuUnit;
    }

    public String getSkuUnitName() {
        return skuUnitName;
    }

    public void setSkuUnitName(String skuUnitName) {
        this.skuUnitName = skuUnitName == null ? null : skuUnitName.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Integer getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(Integer weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getWeightUnitName() {
        return weightUnitName;
    }

    public void setWeightUnitName(String weightUnitName) {
        this.weightUnitName = weightUnitName == null ? null : weightUnitName.trim();
    }

    public BigDecimal getStandardWeight() {
        return standardWeight;
    }

    public void setStandardWeight(BigDecimal standardWeight) {
        this.standardWeight = standardWeight;
    }

    public Integer getStandardWeightUnit() {
        return standardWeightUnit;
    }

    public void setStandardWeightUnit(Integer standardWeightUnit) {
        this.standardWeightUnit = standardWeightUnit;
    }

    public String getStandardWeightUnitName() {
        return standardWeightUnitName;
    }

    public void setStandardWeightUnitName(String standardWeightUnitName) {
        this.standardWeightUnitName = standardWeightUnitName == null ? null : standardWeightUnitName.trim();
    }

    public String getAttrIdStr() {
        return attrIdStr;
    }

    public void setAttrIdStr(String attrIdStr) {
        this.attrIdStr = attrIdStr == null ? null : attrIdStr.trim();
    }

    public String getAttrNameStr() {
        return attrNameStr;
    }

    public void setAttrNameStr(String attrNameStr) {
        this.attrNameStr = attrNameStr == null ? null : attrNameStr.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}