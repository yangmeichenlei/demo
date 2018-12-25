package com.media.form.goods;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.media.common.base.BaseForm;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "GoodsSkuForm", description = "商品sku form")
public class GoodsSkuForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    private String skuId;

    private String goodsId;

    private String goodsName;

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

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startTime;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date endTime;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
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
        this.skuUnitName = skuUnitName;
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
        this.weightUnitName = weightUnitName;
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
        this.standardWeightUnitName = standardWeightUnitName;
    }

    public String getAttrIdStr() {
        return attrIdStr;
    }

    public void setAttrIdStr(String attrIdStr) {
        this.attrIdStr = attrIdStr;
    }

    public String getAttrNameStr() {
        return attrNameStr;
    }

    public void setAttrNameStr(String attrNameStr) {
        this.attrNameStr = attrNameStr;
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
        this.createUserId = createUserId;
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
        this.lastModifyUserId = lastModifyUserId;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "GoodsSkuForm [skuId=" + skuId + ", goodsId=" + goodsId + ", goodsName=" + goodsName + ", skuName="
                + skuName + ", skuNum=" + skuNum + ", skuUnit=" + skuUnit + ", skuUnitName=" + skuUnitName + ", price="
                + price + ", weight=" + weight + ", weightUnit=" + weightUnit + ", weightUnitName=" + weightUnitName
                + ", standardWeight=" + standardWeight + ", standardWeightUnit=" + standardWeightUnit
                + ", standardWeightUnitName=" + standardWeightUnitName + ", attrIdStr=" + attrIdStr + ", attrNameStr="
                + attrNameStr + ", status=" + status + ", createUserId=" + createUserId + ", createTime=" + createTime
                + ", lastModifyUserId=" + lastModifyUserId + ", lastModifyTime=" + lastModifyTime + ", startTime="
                + startTime + ", endTime=" + endTime + "]";
    }

    
}
