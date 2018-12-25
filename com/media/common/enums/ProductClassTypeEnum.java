package com.media.common.enums;

import java.util.ArrayList;
import java.util.List;

import com.media.common.view.EnumView;

/**
 * 1:模块 2:分区 3:类别 4:分类 5:轮播产品 6:轮播分类 7:轮播url 8:轮播静态图片
 * Created by lihaiqiang on 2018/11/07.
 */
public enum ProductClassTypeEnum {
    PATIENT_AREA_PREFIX(1, "patient_area_"),
    PATIENT_CLASS_PREFIX(1, "patient_class_"),
    PATIENT_CAROUSEL_PREFIX(1, "patient_carousel_"),

    MODEL(1, "模块"),
    AREA(2, "分区"),
    CLASS_CATEGORY(3, "类别"),
    CLASS(4, "分类"),
    CAROUSEL_PRODUCT(5, "轮播产品"),
    CAROUSEL_CLASS(6, "轮播分类"),
    CAROUSEL_URL(7, "轮播url"),
    CAROUSEL_STATIC(8, "轮播静态图片");

    private Integer typeId;//类型Id
    private String typeName;//类型名称

    private ProductClassTypeEnum(Integer typeId, String typeName) {
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

    /**
     * 获取产品分类类型
     *
     * @return 产品分类类型数组
     */
    public static List<EnumView> getProductClassType() {
        List<EnumView> productClassTypeEnumList = new ArrayList<EnumView>();
        productClassTypeEnumList.add(new EnumView(MODEL.getTypeId(), MODEL.getTypeName()));
        productClassTypeEnumList.add(new EnumView(AREA.getTypeId(), AREA.getTypeName()));
        productClassTypeEnumList.add(new EnumView(CLASS_CATEGORY.getTypeId(), CLASS_CATEGORY.getTypeName()));
        productClassTypeEnumList.add(new EnumView(CLASS.getTypeId(), CLASS.getTypeName()));
        productClassTypeEnumList.add(new EnumView(CAROUSEL_PRODUCT.getTypeId(), CAROUSEL_PRODUCT.getTypeName()));
        productClassTypeEnumList.add(new EnumView(CAROUSEL_CLASS.getTypeId(), CAROUSEL_CLASS.getTypeName()));
        productClassTypeEnumList.add(new EnumView(CAROUSEL_URL.getTypeId(), CAROUSEL_URL.getTypeName()));
        productClassTypeEnumList.add(new EnumView(CAROUSEL_STATIC.getTypeId(), CAROUSEL_STATIC.getTypeName()));
        return productClassTypeEnumList;
    }
}
