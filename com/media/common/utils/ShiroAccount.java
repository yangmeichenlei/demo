package com.media.common.utils;

import com.media.common.base.AccoutInfo;
import com.media.common.config.Config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

/**
 * Created by lihaiqiang on 2018/08/15.
 */
@Component
public class ShiroAccount {
    private static final Logger logger = LoggerFactory.getLogger(ShiroAccount.class);
    public static AccoutInfo getAccount() {
        try {
            Session session = SecurityUtils.getSubject().getSession();
            AccoutInfo account = new AccoutInfo();
            Object user = session.getAttribute("userSession");
            if(user==null){
                user = new AccoutInfo();
            }
            BeanMapper.copy(user, account);
            return account == null ? new AccoutInfo() : account;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void clearUserSession() {
        Session session = SecurityUtils.getSubject().getSession();
        session.removeAttribute("userSession");
        session.removeAttribute("userSessionId");
    }

    public static Config getConfigObj(HttpHeaders headers) {
        Config cfgObj = new Config();
        String configStr = headers.getFirst("config");
        logger.info("app端请求参数config = "+configStr);
        JsonMapper jsonMapper = new JsonMapper();
        if (org.apache.commons.lang3.StringUtils.isNotEmpty(configStr)) {
            cfgObj = jsonMapper.fromJson(configStr, Config.class);
            if (cfgObj == null) {
                cfgObj = new Config();
            }
        }
        return cfgObj;
    }

    /**
     * 获取后台登录用户userId
     *
     * @return
     */
    public static String getUserId() {
        AccoutInfo accoutInfo = getAccount();
        return accoutInfo == null || accoutInfo.getUserId() == null ? "-1" : accoutInfo.getUserId();
    }
}
