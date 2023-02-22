package com.spring.service.impl;

import com.spring.dao.AccountDao;
import com.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * {@code @Description:}
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    
    // public void setAccountDao(AccountDao accountDao) {
    //    this.accountDao = accountDao;
    // }
    
    /**
     * 转账
     * name1取款，name2存款
     *
     * @param name1
     * @param name2
     * @param money
     */
    @Transactional
    @Override
    public void transfer(String name1, String name2, double money) {
        // 传统解决方法是在此处开启事务
        accountDao.withdraw(name1, money);
        // 模拟网络问题故障
        int i = 1 / 0;
        accountDao.deposit(name2, money);
        // 传统解决方法是在此处结束事务或回滚
    }
}