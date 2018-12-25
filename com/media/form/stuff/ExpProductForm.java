package com.media.form.stuff;

import java.util.List;

/**
 * Created by zhaorong on 2018/11/16.
 */
public class ExpProductForm {
    private List<String> expList;//方法id集合
    private List<String> productList;//产品id集合

    public List<String> getExpList() {
        return expList;
    }

    public void setExpList(List<String> expList) {
        this.expList = expList;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

}
