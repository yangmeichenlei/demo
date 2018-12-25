package com.media.common.enums;

import java.util.ArrayList;
import java.util.List;

import com.media.common.view.EnumView;

/**
 * Created by lihaiqiang on 2018/11/07.
 */
public enum UnitEnum {
    AMOUNT(1, "元"),

    WEIGTH_KG(1, "千克"),
    WEIGTH_G(2, "克"),

    NUM_PCS(1, "件"),
    NUM_SET(2, "套"),
    NUM_LOT(3, "批"),
    NUM_BOX(4, "箱"),
    NUM_TYPE(5, "类"),
    NUM_BOTTLE(6, "瓶");

    private Integer unitCode;//单位编码
    private String unitName;//单位名称

    /**
     * 根据类型Id返回类型名称
     *
     * @param unitCode 单位编码
     * @return unitName 单位名称
     */
    public static String getWeightUnitNameByCode(Integer unitCode) {
        if (unitCode == null) {
            return null;
        }
        if (WEIGTH_G.getUnitCode().intValue() == unitCode.intValue()) {
            return WEIGTH_G.getUnitName();
        } else if (WEIGTH_KG.getUnitCode().intValue() == unitCode.intValue()) {
            return WEIGTH_KG.getUnitName();
        }
        return null;
    }


    /**
     * 根据类型Id返回类型名称
     *
     * @param unitCode 单位编码
     * @return unitName 单位名称
     */
    public static String getAmountUnitNameByCode(Integer unitCode) {
        if (unitCode == null) {
            return null;
        }
        if (AMOUNT.getUnitCode().intValue() == unitCode.intValue()) {
            return AMOUNT.getUnitName();
        }
        return null;
    }

    /**
     * 根据类型Id返回类型名称
     *
     * @param unitCode 单位编码
     * @return unitName 单位名称
     */
    public static String getNumUnitNameByCode(Integer unitCode) {
        if (unitCode == null) {
            return null;
        }

        if (NUM_PCS.getUnitCode().intValue() == unitCode.intValue()) {
            return NUM_PCS.getUnitName();
        } else if (NUM_SET.getUnitCode().intValue() == unitCode.intValue()) {
            return NUM_SET.getUnitName();
        } else if (NUM_LOT.getUnitCode().intValue() == unitCode.intValue()) {
            return NUM_LOT.getUnitName();
        } else if (NUM_BOX.getUnitCode().intValue() == unitCode.intValue()) {
            return NUM_BOX.getUnitName();
        } else if (NUM_TYPE.getUnitCode().intValue() == unitCode.intValue()) {
            return NUM_TYPE.getUnitName();
        } else if (NUM_BOTTLE.getUnitCode().intValue() == unitCode.intValue()) {
            return NUM_BOTTLE.getUnitName();
        }

        return null;
    }

    /**
     * 获取可用的重量单位
     *
     * @return 单位数组
     */
    public static List<EnumView> getWeigthUnit() {
        List<EnumView> unitEnumList = new ArrayList<EnumView>();
        unitEnumList.add(new EnumView(WEIGTH_G.getUnitCode(), WEIGTH_G.getUnitName()));
        unitEnumList.add(new EnumView(WEIGTH_KG.getUnitCode(), WEIGTH_KG.getUnitName()));
        return unitEnumList;
    }

    /**
     * 获取可用的价格金额单位
     *
     * @return 单位数组
     */
    public static List<EnumView> getAmountUnit() {
        List<EnumView> unitEnumList = new ArrayList<EnumView>();
        unitEnumList.add(new EnumView(AMOUNT.getUnitCode(), AMOUNT.getUnitName()));
        return unitEnumList;
    }

    /**
     * 获取可用的数量单位
     *
     * @return 单位数组
     */
    public static List<EnumView> getNumUnit() {
        List<EnumView> unitEnumList = new ArrayList<EnumView>();
        unitEnumList.add(new EnumView(NUM_PCS.getUnitCode(), NUM_PCS.getUnitName()));
        unitEnumList.add(new EnumView(NUM_SET.getUnitCode(), NUM_SET.getUnitName()));
        unitEnumList.add(new EnumView(NUM_LOT.getUnitCode(), NUM_LOT.getUnitName()));
        unitEnumList.add(new EnumView(NUM_BOX.getUnitCode(), NUM_BOX.getUnitName()));
        unitEnumList.add(new EnumView(NUM_TYPE.getUnitCode(), NUM_TYPE.getUnitName()));
        unitEnumList.add(new EnumView(NUM_BOTTLE.getUnitCode(), NUM_BOTTLE.getUnitName()));
        return unitEnumList;
    }


    public Integer getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(Integer unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    private UnitEnum(Integer unitCode, String unitName) {
        this.unitCode = unitCode;
        this.unitName = unitName;
    }


}
