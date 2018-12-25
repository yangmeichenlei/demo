package com.media.common.constant;

import java.util.HashMap;
import java.util.Map;

import com.media.common.utils.DateUtils;
import com.media.common.utils.UUIDUtils;

/**
 * Created by lihaiqiang on 2017/08/13.
 */
public class Constant {
    public static final Map<String, String> ossPath = new HashMap<String, String>();
    public static final Map<String, String> logicticsState = new HashMap<String, String>();
    
    static {
        ossPath.put("public", "ju/image/public/"); //公共的图片
        ossPath.put("userImg", "ju/image/userImage/"); //用户相关的，头像，证件照，营业执照
        ossPath.put("product", "ju/image/product/"); //产品详情图片
        ossPath.put("goods", "ju/image/goods/"); //商品sku图片
        ossPath.put("model", "ju/image/model/"); //分类模块展示图片
        ossPath.put("returnImg", "ju/image/return/"); //售后图片
        ossPath.put("uediter", "ju/image/uediter/"); //售后图片
        ossPath.put("comment", "ju/image/comment/"); //产品评论图片
    }
    
    static {
        logicticsState.put("2", "在途中");
        logicticsState.put("3", "签收");
        logicticsState.put("4", "问题件");
    }
    
    //域名
    public static final String BASE_DOMAIN = "http://www.shangem8.net";
    
    /**
     *加密key
     */
    public static final String SERC_KEY1 = "o28feng#bao#bao~`()";
    public static final String SERC_KEY2 = "o28~`(feng#bao#bao)";
    
    public static final String SPLIT = "/";
    
    public static final String SPLIT_UNDERLINE = "_";
    
    public static final String TONCAT_TMP_FILE = "/upload/files_" + DateUtils.getTodayStr() +"_"+ UUIDUtils.getUUID();
    
    public static final String TONCAT_TMP_PICTURE = "/upload/pictures_" + DateUtils.getTodayStr() +"_"+ UUIDUtils.getUUID();
    
    public static final String UNDER_LINE = "-";
    
    public static final String NULL_STRING = "";
    
    public static final String SPLIT_COMMA = ",";
    
    public static final int ZERO = 0;
    
    public static final int DEFAULT_LENGTH = 1024000;
    
    public static final String HADOOP_OPC_STANDBYEXCEPTION = "org.apache.hadoop.ipc.StandbyException";
}
