package com.media.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lihaiqiang on 2018/08/12.
 */
public class IPUtils {

    /**
     * 获取HttpRequest的 IP地址
     * 若客户端和服务之间增加了中间层（代理层），则需要穿透防火墙获取真实IP地址。
     * 
     * @param request
     * @return
     */
    public final static String getIPAddress(HttpServletRequest request){
    
        String ip = request.getHeader("X-Forwarded-For");
        
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
            
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
                
                ip = request.getHeader("Proxy-Client-IP");
            }
            
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
                
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
                
                ip = request.getHeader("HTTP_CLIENT_IP");
            }
            
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
                
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            
            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
                
                ip = request.getRemoteAddr();
            }
            
        }else if(ip.length() > 15){
            
            String[] ips = ip.split(",");
            for(int index = 0; index < ips.length; index++){
                
                String strIp = (String)ips[index];
                if(!("unknown".equalsIgnoreCase(strIp))){
                    
                    ip = strIp;
                    break;
                }
            }
        }
        
        ip = ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
        
        //NOTE:just for testing.
        if(ip.equalsIgnoreCase("127.0.0.1")){
            
            //ip = randomIPAddress();
        }
        
        return ip;
    }
    
    @SuppressWarnings("unused")
    private final static String randomIPAddress(){
        
        List<String> ips = new ArrayList<String>();
        ips.add("221.216.1.100");//北京 #110000 (省级ID)
        ips.add("121.32.1.100");//广东省广州市白云区#440000
        ips.add("180.201.1.100");//山东省济南市#370000
        ips.add("115.192.1.100");//浙江省杭州市#330000
        ips.add("112.80.1.100");//江苏省南京市#320000
        ips.add("61.152.1.100");//辽宁省沈阳市#210000
        ips.add("120.94.1.100");//四川省成都市#510000
        ips.add("61.168.1.100");//河南省郑州市#410000
        ips.add("59.172.1.100");//湖北省武汉市#420000
        ips.add("180.233.1.100");//福建省厦门市#350000
        ips.add("113.218.1.100");//湖南省常德市#430000
        ips.add("61.182.1.100");//河北省石家庄市#130000
        ips.add("125.62.1.100");//重庆市#500000
        ips.add("211.82.1.100");//山西省太原市#140000
        ips.add("115.152.1.100");//江西省九江市#360000
        ips.add("113.136.1.100");//陕西省西安市#610000
        ips.add("114.96.1.100");//安徽省合肥市#340000
        ips.add("112.98.1.100");//黑龙江省齐齐哈尔市#230000
        ips.add("116.252.1.100");//广西壮族自治区南宁市#450000
        ips.add("59.72.1.100");//吉林省长春市#220000
        ips.add("106.56.1.100");//云南省保山市#530000
        ips.add("125.36.1.100");//天津市#120000
        ips.add("118.230.1.100");//内蒙古自治区呼和浩特市#150000
        ips.add("124.88.1.100");//新疆维吾尔自治区乌鲁木齐市#650000
        ips.add("210.26.1.100");//甘肃省兰州市#620000
        ips.add("114.135.1.100");//贵州省遵义市#520000
        ips.add("121.58.1.100");//海南省海口市#460000
        ips.add("119.60.1.100");//宁夏回族自治区银川市#640000
        ips.add("118.213.1.100");//青海省海东地区#630000
        ips.add("124.31.1.100");//西藏自治区拉萨市#540000
        ips.add("183.182.1.100");//江苏省苏州市#320000
        
        Random random = new Random();
        int index = random.nextInt(ips.size());
        
        return ips.get(index);
    }
}
