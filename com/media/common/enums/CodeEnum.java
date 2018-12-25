package com.media.common.enums;

import java.util.ArrayList;
import java.util.List;

import com.media.common.view.EnumView;
/**
 * Created by lihaiqiang on 2018/08/13.
 */
public enum CodeEnum {
	
    MALE("男", 1), FEMALE("女", 2),

    YES("是", 1), NO("否", 0),
    
    FILE("文件", 1), FILEDIRECTORY("文件夹", 0),

    IDCARD("身份证.", 1), PASSPORT("护照.", 2),

    DOCTOR("医生", 1), PATIENT("患者", 2), AGENT("代理商", 3), SALE("销售", 4), PLATFORM_USER("后台用户", 5),

    ANDROID("Android", 1), IOS("IOS", 2), PC("PC", 3),

    DISABLE("无效", 0), ENABLE("生效", 1),

    DISCARD("作废", 0), CHECKED("已审核", 1), UNCOMMITTED("未提交", 2), UNCHECED("待审核", 3), UNPASSED("审核不通过", 4),

    MENU("菜单", 1), BUTTON("按钮", 2),

    MESSAGE("订单消息", 1), OTHER("其他", 2),

    STARTNO("起始序号", 1),

    IMG_GOODS_SKU("商品sku图片", 1), IMG_PRODUCT_DETAIL("产品详情", 2),

    PRODUCT_SHELVES("上架", 1), PRODUCT_UNDERCARRIAGE("下架", 0),
    // 2-在途中,3-签收,4-问题件
    ON_ROAD("在途中", 2), RECEIPT("签收", 3), PROBLEM("问题件", 4),

    PAY("支付", 1), RETURN("退款", 2),

    ALIPAY("支付宝", 1), WEIXIN("微信", 2), UNION_BANK("银联", 3),

    UNCOMPLETE("未完成", 0), COMPLETED("已完成", 1),
    
    VIDEO_TYPE_FILM("电影", 0), VIDEO_TYPE_TVPLAY("电视剧", 1),
    
    VIDEO_CLASS_END_NODE("父节点", 0), VIDEO_CLASS_END_LEAF("叶子节点", 1),

    PROVINCE_LEVEL("省代", 1), CITY_LEVEL("市代", 2), AREA_LEVEL("区代", 3);

    private String msg;
    private Integer code;

    /**
     * 获取产品上架
     *
     * @return 产品上架
     */
    public static List<EnumView> getProductShelves() {
        List<EnumView> shelvesList = new ArrayList<EnumView>();
        shelvesList.add(new EnumView(PRODUCT_SHELVES.getCode(), PRODUCT_SHELVES.getMsg()));
        shelvesList.add(new EnumView(PRODUCT_UNDERCARRIAGE.getCode(), PRODUCT_UNDERCARRIAGE.getMsg()));
        return shelvesList;
    }

    /**
     * 获取数据状态
     *
     * @return 数据状态
     */
    public static List<EnumView> getCommonStatus() {
        List<EnumView> statusList = new ArrayList<EnumView>();
        statusList.add(new EnumView(ENABLE.getCode(), ENABLE.getMsg()));
        statusList.add(new EnumView(DISABLE.getCode(), DISABLE.getMsg()));
        return statusList;
    }

    /**
     * 获取审核的数据状态
     *
     * @return 审核的数据状态
     */
    public static List<EnumView> getAuditStatus() {
        List<EnumView> statusList = new ArrayList<EnumView>();
        statusList.add(new EnumView(UNCOMMITTED.getCode(), UNCOMMITTED.getMsg()));
        statusList.add(new EnumView(UNCHECED.getCode(), UNCHECED.getMsg()));
        statusList.add(new EnumView(CHECKED.getCode(), CHECKED.getMsg()));
        statusList.add(new EnumView(UNPASSED.getCode(), UNPASSED.getMsg()));
        statusList.add(new EnumView(DISCARD.getCode(), DISCARD.getMsg()));
        return statusList;
    }

    /**
     * 根据code返回上架/下架描述
     *
     * @param code
     *            上架状态编码
     * @return codeName 上架状态名称
     */
    public static String getProductShelvesNameByCode(Integer code) {
        if (code == null) {
            return null;
        }
        if (CodeEnum.PRODUCT_SHELVES.getCode().intValue() == code) {
            return CodeEnum.PRODUCT_SHELVES.getMsg();
        } else if (CodeEnum.PRODUCT_UNDERCARRIAGE.getCode().intValue() == code) {
            return CodeEnum.PRODUCT_UNDERCARRIAGE.getMsg();
        }
        return null;
    }

    /**
     * 根据code返回数据状态
     *
     * @param status
     *            状态编码
     * @return statusName 状态名称
     */
    public static String getCommonStatusNameByStatus(Integer status) {
        if (status == null) {
            return null;
        }
        if (CodeEnum.ENABLE.getCode().intValue() == status) {
            return CodeEnum.ENABLE.getMsg();
        } else if (CodeEnum.DISABLE.getCode().intValue() == status) {
            return CodeEnum.DISABLE.getMsg();
        }
        return null;
    }

    /**
     * 根据code返回审批数据状态
     *
     * @param status
     *            状态编码
     * @return statusName 状态名称
     */
    public static String getAuditStatusNameByStatus(Integer status) {
        if (status == null) {
            return null;
        }
        if (CodeEnum.CHECKED.getCode().intValue() == status) {
            return CodeEnum.CHECKED.getMsg();
        } else if (CodeEnum.UNCOMMITTED.getCode().intValue() == status) {
            return CodeEnum.UNCOMMITTED.getMsg();
        } else if (CodeEnum.UNCHECED.getCode().intValue() == status) {
            return CodeEnum.UNCHECED.getMsg();
        } else if (CodeEnum.UNPASSED.getCode().intValue() == status) {
            return CodeEnum.UNPASSED.getMsg();
        } else if (CodeEnum.DISCARD.getCode().intValue() == status) {
            return CodeEnum.DISCARD.getMsg();
        }
        return null;
    }

    private CodeEnum(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
