package com.media.common.utils;

import org.apache.commons.lang3.time.DateUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.util.*;

public class FeeUtils {
    
    /**
     * @Title: billingCycle
     * @Description: 计算计费区间<br/>
     *               计算规则<br/>
     *               例如,开始时间：2016-03-15 结束时间：2016-05-12<br/>
     *               计算结果：[[2016-03-15,2016-03-31],[2016-04-01,2016-04-30],[2016-05-01,2016-05-12]]
     * @param startDate
     *            开始时间
     * @param endDate
     *            结束时间
     * @return
     * @return: List<List<Date>>
     */
    public static List<List<Date>> feeInterval(final Date startDate, final Date endDate) {
        Date truncateStartDate = DateUtils.truncate(startDate, Calendar.DATE);
        Date truncateEndDate = DateUtils.truncate(endDate, Calendar.DATE);
        Date lastDateOfStartDate = DateUtils
                .addDays(DateUtils.truncate(DateUtils.addMonths(truncateStartDate, 1), Calendar.MONTH), -1);
        List<List<Date>> result = new ArrayList<List<Date>>();
        if (truncateStartDate.compareTo(truncateEndDate) <= 0) {
            if (truncateEndDate.compareTo(lastDateOfStartDate) <= 0) {
                List<Date> r = new ArrayList<Date>();
                r.add(truncateStartDate);
                r.add(truncateEndDate);
                result.add(r);
            } else {
                List<Date> r = new ArrayList<Date>();
                r.add(truncateStartDate);
                r.add(lastDateOfStartDate);
                result.add(r);
                result.addAll(FeeUtils.feeInterval(DateUtils.addDays(lastDateOfStartDate, 1), truncateEndDate));
            }
        }
        return result;
    }
    
    /**
     * @Title: spiltMoneyFee
     * @Description: 月度费用拆分到天
     * @param originFee
     *            原始费用
     * @param feeInterval
     *            计费区间
     * @return 拆分后的费用
     * @return: Long
     */
    public static Long spiltMoneyFee(final Long originFee, final List<Date> feeInterval) {
        if (null != feeInterval && feeInterval.size() >= 2 && null != feeInterval.get(0) && null != feeInterval.get(1)
                && DateUtils.truncatedEquals(feeInterval.get(0), feeInterval.get(1), Calendar.MONTH)) {
            Date truncateStartDate = DateUtils.truncate(feeInterval.get(0), Calendar.DATE);
            Date truncateEndDate = DateUtils.truncate(feeInterval.get(1), Calendar.DATE);
            Date nextMonth = DateUtils.truncate(DateUtils.addMonths(truncateStartDate, 1), Calendar.MONTH);
            Date thisMonth = DateUtils.truncate(truncateStartDate, Calendar.MONTH);
            Long days = (Math.abs(truncateStartDate.getTime() - truncateEndDate.getTime()) / DateUtils.MILLIS_PER_DAY)
                    + 1;
            Long monthDays = Math.abs(nextMonth.getTime() - thisMonth.getTime()) / DateUtils.MILLIS_PER_DAY;
            return originFee * days / monthDays;
        } else {
            return 0L;
        }
    }
    
    /**
     * @Title: calcAccrualDate
     * @Description: 计算应收时间，a月份生成b月份开始的c个月的费用,a<=b
     * @param a
     * @param b
     * @param c
     * @param interval
     * @return 应收日期
     * @return: Date
     */
    public static Date calcAccrualDate(final int a, final int b, final int c, final Date interval) {
        Date currentDate = DateUtils.truncate(interval, Calendar.MONTH);
        int monthint1 = DateUtils.toCalendar(currentDate).get(Calendar.MONTH) + 1;
        int f = monthint1 < b ? monthint1 + 12 : monthint1;
        int[] iarray = { b, b + 1, b + 2, b + 3, b + 4, b + 5, b + 6, b + 7, b + 8, b + 9, b + 10, b + 11 };
        int month = a - 1 + (Arrays.binarySearch(iarray, f) / c) * c;
        if (b != 1 && monthint1 == 1) {
            return DateUtils.setYears(DateUtils.setMonths(currentDate, month),
                    DateUtils.toCalendar(currentDate).get(Calendar.YEAR) - 1);
        } else {
            return DateUtils.setYears(DateUtils.setMonths(currentDate, month),
                    DateUtils.toCalendar(currentDate).get(Calendar.YEAR));
        }
    }
    
    /**
     * @Title: startCalcDate
     * @Description: 计算违约金起算时间
     * @param a
     *            预收月数
     * @param interval
     *            应收日期
     * @return 起算日期
     * @return: Date
     */
    public static Date startCalcDate(final int a, final Date interval) {
        Date currentDate = DateUtils.truncate(interval, Calendar.MONTH);
        return DateUtils.addMonths(currentDate, a + 1);
    }
    
    /**
     * @Title: intervalExclude
     * @Description:从计费区间interval1中排除计费区间interval2<br/>
     *                                                  例如：interval1
     *                                                  [2015-06-01,2015-06-30]<br/>
     *                                                  interval2
     *                                                  [[2015-06-03,2015-06-25]]<br/>
     *                                                  结果：[[2015-06-01,2015-06-02],[2015-06-26,2015-06-30]]
     * 
     * @param interval1
     * @param interval2
     * @return 新的计费区间
     * @return: List<List<Date>>
     */
    public static List<List<Date>> intervalExclude(final List<Date> interval1, final List<List<Date>> interval2) {
        List<Date> origin = FeeUtils.listDate(interval1.get(0), interval1.get(1));
        for (List<Date> target : interval2) {
            origin.removeAll(FeeUtils.listDate(target.get(0), target.get(1)));
        }
        List<List<Date>> ret = FeeUtils.dateSpilt(origin);
        return ret;
    }
    
    /**
     * @Title: dateSpilt
     * @Description: 将散布的日期按联系的时间段进行组合
     * @param origin
     * @return
     * @return: List<List<Date>>
     */
    public static List<List<Date>> dateSpilt(final List<Date> origin) {
        List<List<Date>> ret = new ArrayList<>();
        if (Collections3.isEmpty(origin)) {
            return ret;
        }
        Collections.sort(origin);
        List<Date> temp1 = new ArrayList<>();
        Date startDate = null;
        Date endDate = null;
        Date lastDate = DateUtils.addDays(DateUtils.truncate(DateUtils.addMonths(origin.get(0), 1), Calendar.MONTH),
                -1);
        boolean dg = false;
        for (Date d : origin) {
            if (null == startDate) {
                startDate = d;
                endDate = d;
                temp1.add(d);
            } else if (d.equals(lastDate)) {
                endDate = d;
                temp1.add(d);
                dg = true;
                break;
            } else if (d.equals(DateUtils.addDays(endDate, 1))) {
                endDate = d;
                temp1.add(d);
            } else {
                dg = true;
                break;
            }
        }
        if (dg) {
            origin.removeAll(temp1);
            ret.addAll(FeeUtils.dateSpilt(origin));
        }
        temp1.clear();
        temp1.add(startDate);
        temp1.add(endDate);
        ret.add(temp1);
        return ret;
    }
    
    /**
     * @Title: listDate
     * @Description: 将开始时间、结束时间之间的所有时间存储到List
     * @param startDate
     * @param endDate
     * @return
     * @return: List<Date>
     */
    public static List<Date> listDate(final Date startDate, final Date endDate) {
        Date d1 = DateUtils.truncate(startDate, Calendar.DATE);
        Date d2 = DateUtils.truncate(endDate, Calendar.DATE);
        List<Date> dateList = new ArrayList<Date>();
        for (Date d = d1; !d.after(d2); d = DateUtils.addDays(d, 1)) {
            dateList.add(d);
        }
        return dateList;
    }
    
    /**
     * @Title: f2y
     * @Description: 单位转换毫转元
     * @param f
     * @return
     * @return: String
     */
    public static String f2y(final Long f) {
        Double d = f / 10000D;
        return FeeUtils.limitDecimalPlace(BigDecimal.valueOf(d).stripTrailingZeros().toPlainString(), 2);
    }

    /**
     * @Title: limitDecimalPlace
     * @Description: 限制最短小数位
     * @param s
     * @param s1
     * @return
     * @return: String
     */
    public static String limitDecimalPlace(final String s, final int s1) {
        String[] args = s.split("\\.");
        if (args.length == 1) {
            return s + "." + String.format("%1$0" + s1 + "d", 0);
        } else if (args.length == 2) {
            if (args[1].length() < s1) {
                return s + String.format("%1$0" + (s1 - args[1].length()) + "d", 0);
            } else {
                return s;
            }
            
        } else {
            return "";
        }
    }
    
    /**
     * @Title: y2f
     * @Description: 单位转换元转毫
     * @param y
     * @return
     * @return: Long
     */
    public static Long y2f(final String y) {
        Double d = Double.valueOf(y);
        return Math.round(d * 10000);
    }
    
    /**
     * 费用计算
     * 
     * @param script
     * @return
     * @throws NumberFormatException
     * @throws ScriptException
     */
    public static Long calcFee(final String script) throws NumberFormatException, ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        return Long.valueOf(nashorn.eval(script).toString());
    }
    
    /**
     * 费用适配精度
     * 
     * @param originFee
     * @param degree，0元、1角，2分
     * @return
     */
    public static Long adaptDegree(Long originFee, Long degree) {
        if (degree == null) {
            degree = 2L;
        }
        BigDecimal bigFee = new BigDecimal(originFee);
        switch (degree.intValue()) {
            case 0:
                bigFee = bigFee.divide(new BigDecimal(10000L));
                break;
            case 1:
                bigFee = bigFee.divide(new BigDecimal(1000L));
                break;
            default:
                bigFee = bigFee.divide(new BigDecimal(100L));
                break;
        }
        Long newFee = 0L;
        switch (degree.intValue()) {
            case 0:
                newFee = bigFee.setScale(0, BigDecimal.ROUND_HALF_UP).longValue() * 10000L;
                break;
            case 1:
                newFee = bigFee.setScale(0, BigDecimal.ROUND_HALF_UP).longValue() * 1000L;
                break;
            default:
                newFee = bigFee.setScale(0, BigDecimal.ROUND_HALF_UP).longValue() * 100L;
                break;
        }
        return newFee;
    }
    
    /**
     * 违约金计算
     * 
     * @param penaltyFormula
     * @param penaltyJson
     * @param params
     * @return
     * @throws NumberFormatException
     * @throws ScriptException
     */
    public static Long calcPenalty(final String penaltyFormula, final String penaltyJson,
            final Map<String, String> params) throws NumberFormatException, ScriptException {
        @SuppressWarnings("unchecked")
		Map<String, String> map = JsonMapper.nonDefaultMapper().fromJson(penaltyFormula, Map.class);
        String[] propertyNames = map.get("args").split(",");
        List<String> argsvalue = new ArrayList<>();
        for (String pro : propertyNames) {
            if (null != pro.trim() && "".equals(pro.trim())) {
                argsvalue.add(params.get(pro));
            }
        }
        String script = "var BigDecimal = Java.type('java.math.BigDecimal');var BigInteger = Java.type('java.math.BigInteger');function fee("
                + map.get("args") + "){" + map.get("script") + "};fee(" + Collections3.convertToString(argsvalue, ",")
                + ");";
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        return Long.valueOf(nashorn.eval(script).toString());
    }
    
    /**
     * @Title: digitUppercase
     * @Description: 金额转大写
     * @param num
     * @return
     * @throws Exception
     * @return: String
     */
    public static String digitUppercase(final String num) throws Exception {
        String fraction[] = { "角", "分" };
        String digit[] = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        
        String unit1[] = { "", "拾", "佰", "仟" };// 把钱数分成段,每四个一段,实际上得到的是一个二维数组
        String unit2[] = { "元", "万", "亿", "万亿" }; // 把钱数分成段,每四个一段,实际上得到的是一个二维数组
        BigDecimal bigDecimal = new BigDecimal(num);
        bigDecimal = bigDecimal.multiply(new BigDecimal(100));
        String strVal = String.valueOf(bigDecimal.toBigInteger());
        String head = strVal.substring(0, strVal.length() - 2); // 整数部分
        String end = strVal.substring(strVal.length() - 2); // 小数部分
        String endMoney = "";
        String headMoney = "";
        if ("00".equals(end)) {
            endMoney = "整";
        } else {
            if (!end.substring(0, 1).equals("0")) {
                endMoney += digit[Integer.valueOf(end.substring(0, 1))] + fraction[0];
            } else if (end.substring(0, 1).equals("0") && !end.substring(1, 2).equals("0")) {
                endMoney += "零";
            }
            if (!end.substring(1, 2).equals("0")) {
                endMoney += digit[Integer.valueOf(end.substring(1, 2))] + fraction[1];
            }
        }
        char[] chars = head.toCharArray();
        // 段位置是否已出现zero
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        // 0连续出现标志
        boolean zeroKeepFlag = false;
        int vidxtemp = 0;
        for (int i = 0; i < chars.length; i++) {
            // 段内位置 unit1
            int idx = (chars.length - 1 - i) % 4;
            // 段位置 unit2
            int vidx = (chars.length - 1 - i) / 4;
            String s = digit[Integer.valueOf(String.valueOf(chars[i]))];
            if (!"零".equals(s)) {
                headMoney += s + unit1[idx] + unit2[vidx];
                zeroKeepFlag = false;
            } else if (i == chars.length - 1 || map.get("zero" + vidx) != null) {
                headMoney += "";
            } else {
                headMoney += s;
                zeroKeepFlag = true;
                // 该段位已经出现0；
                map.put("zero" + vidx, true);
            }
            if (vidxtemp != vidx || i == chars.length - 1) {
                headMoney = headMoney.replaceAll(unit2[vidx], "");
                headMoney += unit2[vidx];
            }
            if (zeroKeepFlag && (chars.length - 1 - i) % 4 == 0) {
                headMoney = headMoney.replaceAll("零", "");
            }
        }
        return headMoney + endMoney;
    }
    /**
     * @Title: f2y
     * @Description: 单位转换毫转元
     * @param f
     * @return
     * @return: String
     */
    public static String f2y100(final Long f) {
        BigDecimal bigFee = new BigDecimal(f);
        bigFee = bigFee.divide(new BigDecimal(100L));
        Long newFee = bigFee.setScale(0, BigDecimal.ROUND_HALF_UP).longValue() * 1L;
        return String.valueOf(newFee);
    }
}