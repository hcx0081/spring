package com.spring.pojo;

/**
 * @description: 账户实体类
 */
public class Account {
    private String name;
    private String money;
    
    public Account() {
    }
    
    public Account(String name, String money) {
        this.name = name;
        this.money = money;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getMoney() {
        return money;
    }
    
    public void setMoney(String money) {
        this.money = money;
    }
    
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
