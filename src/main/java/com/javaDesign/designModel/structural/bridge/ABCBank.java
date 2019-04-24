package com.javaDesign.designModel.structural.bridge;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 15:23
 **/
public class ABCBank extends Bank {
    public ABCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}