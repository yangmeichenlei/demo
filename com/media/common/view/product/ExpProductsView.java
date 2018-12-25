package com.media.common.view.product;

import java.util.List;

/**
 * Created by zhaorong on 2018/11/16.
 */
public class ExpProductsView {
    private List<ProductView> bindedList;// 已经绑定的产品
    private List<ProductView> toBeBindList;// 未绑定的产品

    public List<ProductView> getBindedList() {
        return bindedList;
    }

    public void setBindedList(List<ProductView> bindedList) {
        this.bindedList = bindedList;
    }

    public List<ProductView> getToBeBindList() {
        return toBeBindList;
    }

    public void setToBeBindList(List<ProductView> toBeBindList) {
        this.toBeBindList = toBeBindList;
    }

}
