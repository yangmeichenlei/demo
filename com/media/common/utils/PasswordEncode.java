package com.media.common.utils;



import java.security.MessageDigest;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import com.media.common.constant.Constant;
import com.media.common.enums.CodeEnum;
import com.media.form.user.UserForm;

/**
 * Created by lihaiqiang on 2018/08/12.
 */

public class PasswordEncode {
    private static String algorithmName = "md5";
    private static int hashIterations = 2;

    public static void encodePassword(UserForm user) {
        String newPassword=null;
        if(CodeEnum.PLATFORM_USER.getCode().equals(user.getUserType())){
            newPassword = new SimpleHash(algorithmName, user.getPassword(),  ByteSource.Util.bytes(user.getUserName()), hashIterations).toHex();
        }else{
            newPassword = new SimpleHash(algorithmName, user.getPassword(),ByteSource.Util.bytes(user.getMobile()), hashIterations).toHex();
        }
        user.setPassword(newPassword);
    }
    //MD5单项加密
    public final static String MD5(String s) {
        char hexDigits[] = { '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f' };
        try {
        byte[] strTemp = s.getBytes();
        MessageDigest mdTemp = MessageDigest.getInstance("MD5");
        mdTemp.update(strTemp);
        byte[] md = mdTemp.digest();
        int j = md.length;
        char str[] = new char[j * 2];
        int k = 0;
        for(int i=0;i<j;i++){
        byte byte0 = md[i];
        str[k++] = hexDigits[byte0 >>> 4 & 0xf];
        str[k++] = hexDigits[byte0 & 0xf];
         }
           return new String(str);
        } catch (Exception e) {
            return null;
          }
        }
    /**
     * 生成加密的salt值
     * @return
     */
    public static String getSalt(){
        String salt =  Constant.SERC_KEY1+DateUtils.getTodayStr()+Constant.SERC_KEY2;
        return salt;
    }
    /**
     * 密码加密
     * @param password 原密码字符
     * @param salt 盐值
     * @return
     * @throws DataAccessException
     */
    public static String encodePassword(String password, Object salt)
            throws DataAccessException {
        return new Md5PasswordEncoder().encodePassword(password, salt);
    }
    public static String encodePhone(String phone,String salt,String currDate){
        @SuppressWarnings("unused")
        PasswordEncode passwordEncode=new PasswordEncode();
        String firstEncode = PasswordEncode.encodePassword(phone,salt);
        String finalEncode = PasswordEncode.encodePassword(firstEncode+currDate,salt);
        return finalEncode;
    }
    public static void main(String[] args){
        String salt = PasswordEncode.getSalt();
        String fianEncode = PasswordEncode.encodePhone("18030713122", salt, DateUtils.getTodayStr());
        System.out.println("fianEncode="+fianEncode);
    }
}
