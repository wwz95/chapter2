package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志信息
 *
 * @author WWZ
 */
public class LoginLog implements Serializable {
    /**
     * 登陆日志id
     **/
    private int loginLogId;
    /**
     * 用户id
     **/
    private int userId;
    /**
     * 登陆ip
     **/
    private String ip;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 登陆时间
     **/
    private Date loginDate;
}
