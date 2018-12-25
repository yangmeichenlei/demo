package com.media.form.cart;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import com.media.common.model.address.UserAddress;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lihaiqiang on 2018/08/14.
 */
@ApiModel(value = "CartSumForm",description = "操作购物车商品类")
public class CartSumForm implements Serializable{
    private String cartId;
    private List<CartItemForm> cartItems;
    private String userId;
    private String provinceId;
    private String cityId;
    private String areaId;
    private BigDecimal totalPrice;
    private UserAddress userAddress; //用户收货地址信息
    private String memo;
    private String expressId;
    private String userAddressId;
    private Integer ifBuyNow; //是否立即购买 0-否，1-是
    public List<CartItemForm> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemForm> cartItems) {
        this.cartItems = cartItems;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(String userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Integer getIfBuyNow() {
        return ifBuyNow;
    }

    public void setIfBuyNow(Integer ifBuyNow) {
        this.ifBuyNow = ifBuyNow;
    }

    @Override
    public String toString() {
        return "CartSumForm{" +
                "cartId='" + cartId + '\'' +
                ", cartItems=" + cartItems +
                ", userId='" + userId + '\'' +
                ", provinceId='" + provinceId + '\'' +
                ", cityId='" + cityId + '\'' +
                ", areaId='" + areaId + '\'' +
                ", totalPrice=" + totalPrice +
                ", userAddress=" + userAddress +
                ", memo='" + memo + '\'' +
                ", expressId='" + expressId + '\'' +
                ", userAddressId='" + userAddressId + '\'' +
                ", ifBuyNow=" + ifBuyNow +
                '}';
    }
}
