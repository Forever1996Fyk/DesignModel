package com.javaDesign.designModel.structural.bridge;

/**
 * @program: designModel
 * @description: 银行抽象类
 * @author: YuKai Fan
 * @create: 2019-02-12 15:19
 **/
public abstract class Bank {
    protected Account account;
    public Bank(Account account) {
        this.account = account;
    }
    abstract Account openAccount();
}