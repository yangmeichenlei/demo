package com.media.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class OrderReturnType extends EnumType{
    private static Map<Integer,EnumType> map = new HashMap<>();

    public static OrderReturnType REFUND = new OrderReturnType(1,"仅退款");
    public static OrderReturnType REFUND_GOODS = new OrderReturnType(2,"退货退款");

    private static Map<Integer, EnumType> enumConstantDirectory = null;
    public OrderReturnType(int code, String msg) {

        super(code, msg);
        map.put(code,this);
    }

    public static String valueOf(int code) {
        return map.get(code).getLabel();
    }

}
