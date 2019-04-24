package com.javaDesign.designModel.structural.bridge;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 15:30
 **/
public class Test {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}