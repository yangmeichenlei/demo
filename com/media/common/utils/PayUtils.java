package com.media.common.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by lihaiqiang on 2018/08/20.
 */
public class PayUtils {

    /**
     * 生成订单交易号
     *
     * @param orderCode
     * @return
     */
    public static String getTradeNo(String orderCode) {
        if (StringUtils.isNotBlank(orderCode)) {
            return orderCode + DateUtils.getCurrentDateTimeAsString("yyyyMMddHHmmss");
        } else {
            return UUID.randomUUID().toString().replace("-", "");
        }
    }

    /**
     * @return 交易日期(yyyyMMddHHmmss)
     */
    public static String getTradeDate() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());//交易日期
    }

    /**
     * 向流中写入回调结果
     * @param response
     * @param result
     */
    public static void writeResult(HttpServletResponse response, String result) {
        try {
            response.reset();
            response.setContentType("text/xml;charset=UTF-8");
            PrintWriter printWriter = response.getWriter();
            printWriter.print(result);
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
