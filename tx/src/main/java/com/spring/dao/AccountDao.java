package com.spring.dao;

/**
 * @Description:
 */
public interface AccountDao {
    /**
     * 取款
     *
     * @param name
     * @param money
     */
    void withdraw(String name, double money);
    
    /**
     * 存款
     *
     * @param name
     * @param money
     */
    void deposit(String name, double money);
}
