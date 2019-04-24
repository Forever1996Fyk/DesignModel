package com.javaDesign.designModel.structural.bridge;

/**
 * @program: designModel
 * @description: 活期账号
 * @author: YuKai Fan
 * @create: 2019-02-12 15:17
 **/
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}