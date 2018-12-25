package com.media.common.utils;

import java.security.MessageDigest;

/**
 * 
* @ClassName: Md5Utils 
* @Description:  Md5加密工具类，用于对会员密码进行加密
* @author AWG
* @date 2018年10月12日 下午1:30:32 
*
 */
public final class Md5Utils {

    /**
     * 对字符串进行加密
     * @param strs 要加密的字符串
     * @return 加密后的字符串
     */
     public static String str2MD5(String strs) {
        StringBuffer sb = new StringBuffer();
        try {
             MessageDigest digest = MessageDigest.getInstance("MD5");
             byte[] bs = digest.digest(strs.getBytes());
             for (byte b : bs) {
                 int x = b & 255;
                 //把取出的数据转成十六进制数
                 String s = Integer.toHexString(x);
                if (x < 16) {
                     sb.append("0");
                 }
                 sb.append(s);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return sb.toString();
     }
}