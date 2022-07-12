package com.spring.service;

/**
 * @Description:
 */
public interface AccountService {
    /**
     * 转账
     * name1取款，name2存款
     *
     * @param name1
     * @param name2
     * @param money
     */
    void transfer(String name1, String name2, double money);
}
