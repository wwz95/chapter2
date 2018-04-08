package com.smart.dao;

import com.smart.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginLogDao {
    /**
     * 保存登陆日志SQL
     **/
    private final static String INSERT_LOGIN_LOG_SQL = "INSERT INTO t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginlog) {
        jdbcTemplate.update(INSERT_LOGIN_LOG_SQL, new Object[]{loginlog.getUserId(), loginlog.getIp(), loginlog.getLoginDate()});
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
