package com.media.common.utils;

import java.util.Random;
import java.util.UUID;

/**
 * 
* @ClassName: UUIDUtils 
* @Description:  UUID生成工具，用于生成32位的UUID
* @author AWG
* @date 2018年10月11日 下午5:04:48 
*
 */
public final class UUIDUtils {

    public UUIDUtils() {
        
    }

    /**
     * 自动生成32位的UUID，对应数据库会员表的主键，进行插入用
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
    /**
     * 自动生成11位的UID，对应会员特殊标识
     * @return
     */
    public static String generateStuffUID(){
        Random random = new Random();
        String result="";
        for(int i=0;i<11;i++){
            //首字母不能为0
            result += (random.nextInt(9)+1);
        }
        return result;
    }
    
}
