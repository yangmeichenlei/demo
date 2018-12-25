package com.media.form.cart;


import java.math.BigDecimal;

import com.media.common.base.BaseForm;

/**
 * Created by lihaiqiang on 2018/08/14.
 */
public class CartItemForm extends BaseForm {
    private String id;

    private String userId;
    private String cartItemId;
    private String cartId;

    private String productId;

    private String productName;

    private String productType;

    private String productTypeName;

    private BigDecimal productPrice;

    private BigDecimal productFInalPrice;

    private Integer productNum;

    private BigDecimal totalPrice;

    private BigDecimal totalFinalPrice;

    private Integer isSelect;

    private String unit;

    private String unitId;

    private String productImg;

    private String areaId;

    private String productDesc;
    private String productGoodsDesc;
    private BigDecimal productWeight;
    private BigDecimal disPrice =BigDecimal.ZERO;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Integer getIsSelect() {
        return isSelect;
    }

    public void setIsSelect(Integer isSelect) {
        this.isSelect = isSelect;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductGoodsDesc() {
        return productGoodsDesc;
    }

    public void setProductGoodsDesc(String productGoodsDesc) {
        this.productGoodsDesc = productGoodsDesc;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    public BigDecimal getDisPrice() {
        return disPrice;
    }

    public void setDisPrice(BigDecimal disPrice) {
        this.disPrice = disPrice;
    }

    public BigDecimal getProductFInalPrice() {
        return productFInalPrice;
    }

    public void setProductFInalPrice(BigDecimal productFInalPrice) {
        this.productFInalPrice = productFInalPrice;
    }

    public BigDecimal getTotalFinalPrice() {
        return totalFinalPrice;
    }

    public void setTotalFinalPrice(BigDecimal totalFinalPrice) {
        this.totalFinalPrice = totalFinalPrice;
    }

    @Override
    public String toString() {
        return "CartItemForm{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", cartItemId='" + cartItemId + '\'' +
                ", cartId='" + cartId + '\'' +
                ", productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productTypeName='" + productTypeName + '\'' +
                ", productPrice=" + productPrice +
                ", productFInalPrice=" + productFInalPrice +
                ", productNum=" + productNum +
                ", totalPrice=" + totalPrice +
                ", totalFinalPrice=" + totalFinalPrice +
                ", isSelect=" + isSelect +
                ", unit='" + unit + '\'' +
                ", unitId='" + unitId + '\'' +
                ", productImg='" + productImg + '\'' +
                ", areaId='" + areaId + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productGoodsDesc='" + productGoodsDesc + '\'' +
                ", productWeight=" + productWeight +
                ", disPrice=" + disPrice +
                '}';
    }
}
