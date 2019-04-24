package com.javaDesign.designModel.structural.bridge;

/**
 * @program: designModel
 * @description: 定期账号
 * @author: YuKai Fan
 * @create: 2019-02-12 15:17
 **/
public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}