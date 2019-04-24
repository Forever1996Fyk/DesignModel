package com.javaDesign.designModel.structural.bridge;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 15:24
 **/
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    Account openAccount() {
        System.out.println("打开工商银行账号");
        account.openAccount();
        return account;
    }
}