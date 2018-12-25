package com.media.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lihaiqiang on 2018/08/15.
 */

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
@Service
public class RuleVerifyUtils {
    private static String idCard = "^(\\d{6})(19|20)(\\d{2})(1[0-2]|0[1-9])(0[1-9]|[1-2][0-9]|3[0-1])(\\d{3})(\\d|X|x)?$";
    private static String numberalphabet = "[A-Za-z0-9_]+";
    private static String mobilePhone = "^[1][3,4,5,6,7,8,9][0-9]{9}$";
    private static String areaCodePhnoe = "^[0][1-9]{2,3}-[0-9]{5,10}$";
    private static String nareaCodePhnoe = "^[1-9]{1}[0-9]{5,8}$";
    private static String nonChinese = "^[a-zA-Z0-9]{0,}$";
    private static String email = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private static String number = "^[0-9]*[1-9][0-9]*$";
    private static String zip = "[1-9]\\d{5}";
    private static String plateNumbers = "^[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼使领A-Z]{1}[A-Z]{1}[A-Z0-9]{4}[A-Z0-9挂学警港澳]{1}$";
    //密码必须由数字和字母组成
    private static String   densityPassword="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}";
    //邮电匹配
    @SuppressWarnings("unused")
    private static String mail="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.(?:com|cn|edu))";
    
    private static RuleVerifyUtils instance = null;
    private RuleVerifyUtils() {
    }

    public static RuleVerifyUtils getInstance() {
        if(null == instance) {
            synchronized(RuleVerifyUtils.class) {
                if(instance == null) {
                    instance = new RuleVerifyUtils();
                }
            }
        }

        return instance;
    }

    public boolean validateIdCard(String value) {
        if(!StringUtils.isNotBlank(value)) {
            return true;
        } else {
            Pattern pattern1 = Pattern.compile(idCard);
            Matcher matcher = pattern1.matcher(value);
            int[] prefix = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
            int[] suffix = new int[]{1, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2};
            if(!matcher.matches()) {
                return false;
            } else {
                Map<String, String> cityMap = initCityMap();
                if(cityMap.get(value.substring(0, 2)) == null) {
                    return false;
                } else {
                    int idCardWiSum = 0;

                    int idCardMod;
                    for(idCardMod = 0; idCardMod < 17; ++idCardMod) {
                        idCardWiSum += Integer.valueOf(value.substring(idCardMod, idCardMod + 1)).intValue() * prefix[idCardMod];
                    }

                    idCardMod = idCardWiSum % 11;
                    String idCardLast = value.substring(17);
                    return idCardMod == 2?idCardLast.equalsIgnoreCase("x"):idCardLast.equals(suffix[idCardMod] + "");
                }
            }
        }
    }

    private static Map<String, String> initCityMap() {
        Map<String, String> cityMap = new HashMap<String, String>();
        cityMap.put("11", "北京");
        cityMap.put("12", "天津");
        cityMap.put("13", "河北");
        cityMap.put("14", "山西");
        cityMap.put("15", "内蒙古");
        cityMap.put("21", "辽宁");
        cityMap.put("22", "吉林");
        cityMap.put("23", "黑龙江");
        cityMap.put("31", "上海");
        cityMap.put("32", "江苏");
        cityMap.put("33", "浙江");
        cityMap.put("34", "安徽");
        cityMap.put("35", "福建");
        cityMap.put("36", "江西");
        cityMap.put("37", "山东");
        cityMap.put("41", "河南");
        cityMap.put("42", "湖北");
        cityMap.put("43", "湖南");
        cityMap.put("44", "广东");
        cityMap.put("45", "广西");
        cityMap.put("46", "海南");
        cityMap.put("50", "重庆");
        cityMap.put("51", "四川");
        cityMap.put("52", "贵州");
        cityMap.put("53", "云南");
        cityMap.put("54", "西藏");
        cityMap.put("61", "陕西");
        cityMap.put("62", "甘肃");
        cityMap.put("63", "青海");
        cityMap.put("64", "宁夏");
        cityMap.put("65", "新疆");
        cityMap.put("71", "台湾");
        cityMap.put("81", "香港");
        cityMap.put("82", "澳门");
        return cityMap;
    }

    public boolean validateNumberalphabet(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern pattern = Pattern.compile(numberalphabet);
            Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        } else {
            return true;
        }
    }

    public boolean validateMobilePhone(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern pattern = Pattern.compile(mobilePhone);
            Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        } else {
            return true;
        }
    }

    public boolean validateNareaCodePhnoe(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern p1 = null;
            Pattern p2 = null;
            Matcher m = null;
            boolean b = false;
            p1 = Pattern.compile(areaCodePhnoe);
            p2 = Pattern.compile(nareaCodePhnoe);
            b = this.validateMobilePhone(value);
            if(!b) {
                if(value.length() > 9) {
                    m = p1.matcher(value);
                    b = m.matches();
                } else {
                    m = p2.matcher(value);
                    b = m.matches();
                }
            }

            return b;
        } else {
            return true;
        }
    }

    public boolean validateNonChinese(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern pattern = Pattern.compile(nonChinese);
            Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        } else {
            return true;
        }
    }

    public boolean validateEmail(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern pattern = Pattern.compile(email);
            Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        } else {
            return true;
        }
    }

    public boolean validateNumber(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern pattern = Pattern.compile(number);
            Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        } else {
            return true;
        }
    }

    public boolean validateZip(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern pattern = Pattern.compile(zip);
            Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        } else {
            return true;
        }
    }

    public boolean validatePlateNumbers(String value) {
        if(StringUtils.isNotBlank(value)) {
            Pattern pattern = Pattern.compile(plateNumbers);
            Matcher matcher = pattern.matcher(value);
            return matcher.matches();
        } else {
            return true;
        }
    }
    
   /**
 * @Description  获得全匹配匹配  
 * @return
 */
  public boolean   getMatching(String regex,String srcStr){
     Pattern pattern=Pattern.compile(regex);
     Matcher matcher=pattern.matcher(srcStr);
     boolean flag=matcher.matches();
     return flag;
  }
  public static String getDensityPassword() {
        return densityPassword;
    }

    public static void setDensityPassword(String densityPassword) {
        RuleVerifyUtils.densityPassword = densityPassword;
    }
  
    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        RuleVerifyUtils.email = email;
    }

}
