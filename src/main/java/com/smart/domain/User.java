package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * 领域对象一般要实现Serializable 接口，以便可以序列化
 *
 * @author WWZ
 */
public class User implements Serializable {
    /**
     * 用户id
     **/
    private int userId;
    /**
     * 用户名
     **/
    private String username;
    /**
     * 密码
     **/
    private String password;
    /**
     * 积分
     **/
    private int credits;
    /**
     * 最后一次登陆用ip
     **/
    private String lastIp;
    /**
     * 最后一次登陆时间
     **/
    private Date lastVisit;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }
}
