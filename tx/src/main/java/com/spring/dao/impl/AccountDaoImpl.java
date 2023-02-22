package com.spring.dao.impl;

import com.spring.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * {@code @Description:}
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    // public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    //    this.jdbcTemplate = jdbcTemplate;
    // }
    
    /**
     * 取款
     *
     * @param name
     * @param money
     */
    @Override
    public void withdraw(String name, double money) {
        jdbcTemplate.update("update account set money=money-? where name=?", money, name);
    }
    
    /**
     * 存款
     *
     * @param name
     * @param money
     */
    @Override
    public void deposit(String name, double money) {
        jdbcTemplate.update("update account set money=money+? where name=?", money, name);
    }
}