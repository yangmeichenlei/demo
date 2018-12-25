package com.media.common.utils;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class CheckUtils {
    private static CheckUtils instance;

    private HashMap<String,HttpSession> map;

    private CheckUtils() {
        map = new HashMap<String,HttpSession>();
    }

    public static CheckUtils getInstance() {
        if (instance == null) {
            instance = new CheckUtils();
        }
        return instance;
    }
    
    public synchronized void addMobileCode(String type, String mobile, String code,HttpSession session) {
        session.setMaxInactiveInterval(3);
        session.setAttribute("code",code);
        map.put(type + mobile, session);
    }
    public synchronized HttpSession delMobileCode(String type, String mobile) {
        try{
            return  map.remove(type + mobile);
        }catch(Throwable e) {
            return null;
        }
            
        
    }

    public synchronized void setMobileCode(String type, String mobile, String code,HttpSession session) {
        session.setMaxInactiveInterval(5*60);
        session.setAttribute("code",code);
        map.put(type + mobile, session);
    }
    public synchronized  HttpSession   getMobileCode(String type, String mobile) {
        try{
            return  map.get(type + mobile);
        }catch(Throwable e) {
            return null;
        }
    }
    
    public  void test(String type, String mobile, String code,HttpSession session) {
        /*
         * 下面这种如果和hashmap搭配,要重写键的属性
        try {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    map.remove(type+mobile);
                    // 关闭定时
                    timer.cancel();
                }
            }, 5 * 60 * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
    }
}
    


