package com.media.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;


/**
 * Created by lihaiqiang on 2018/08/15.
 */
public class StringUtils extends org.apache.commons.lang.StringUtils {

    @SuppressWarnings("unused")
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 字符串拼接
     *
     * @param strs
     * @param separator
     * @return
     */
    public static String arrayAsString(String[] strs, String separator) {
        StringBuffer sb = new StringBuffer();
        try {
            for (String str : strs) {
                sb.append(str).append(separator);
            }
            sb = sb.delete(sb.length() - separator.length(), sb.length());
        } catch (Exception e) {
            return null;
        }
        return sb.toString();
    }

    /**
     * 获取32位uuid
     *
     * @return
     */
    public static String getUUID32() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
