package com.media.common.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class OrderReturnStatus extends EnumType {

    private static Map<Integer, EnumType> map = new HashMap<>();

    public static OrderReturnStatus NEW = new OrderReturnStatus(0, "申请售后");
    public static OrderReturnStatus CANCEL = new OrderReturnStatus(1, "取消售后");
    public static OrderReturnStatus SEND_GOODS = new OrderReturnStatus(2, "待买家发货");
    public static OrderReturnStatus RECEIVE_GOODS = new OrderReturnStatus(3, "待商家收货");
    public static OrderReturnStatus REFUSED = new OrderReturnStatus(4, "拒绝退货");
    public static OrderReturnStatus COMPLETE = new OrderReturnStatus(5, "售后已完成");
    public static OrderReturnStatus ERROR = new OrderReturnStatus(6, "申请售后异常");
    public static OrderReturnStatus HANDING = new OrderReturnStatus(7, "退款中");

    public OrderReturnStatus(int code, String msg) {
        super(code, msg);
        map.put(code, this);
    }

    public static String valueOf(int code) {
        return map.get(code).getLabel();
    }

}
