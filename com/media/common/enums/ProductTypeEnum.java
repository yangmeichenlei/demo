package com.media.common.enums;

import java.util.ArrayList;
import java.util.List;

import com.media.common.view.EnumView;

/**
 * Created by lihaiqinag on 2018/08/15.
 */
public enum ProductTypeEnum {
    SINGLE_SKU(1, "单件商品"),
    SUITS_SKU(2, "套装");

    private Integer typeId;//产品类型Id
    private String typeName;//产品类型名称

    /**
     * 根据类型Id返回类型名称
     *
     * @param typeId 类型Id
     * @return 类型名称
     */
    public static String getTypeNameById(Integer typeId) {
        if (typeId == null) {
            return null;
        }
        if (SINGLE_SKU.getTypeId().intValue() == typeId.intValue()) {
            return SINGLE_SKU.getTypeName();
        } else if (SUITS_SKU.getTypeId().intValue() == typeId.intValue()) {
            return SUITS_SKU.getTypeName();
        }
        return null;
    }

    /**
     * 获取产品类型
     *
     * @return 产品类型数组
     */
    public static List<EnumView> getProductType() {
        List<EnumView> productTypeEnumList = new ArrayList<EnumView>();
        productTypeEnumList.add(new EnumView(SINGLE_SKU.getTypeId(), SINGLE_SKU.getTypeName()));
        productTypeEnumList.add(new EnumView(SUITS_SKU.getTypeId(), SUITS_SKU.getTypeName()));
        return productTypeEnumList;
    }


    private ProductTypeEnum(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
