package com.javaDesign.designModel.structural.bridge;

/**
 * @program: designModel
 * @description: 账号接口
 * @author: YuKai Fan
 * @create: 2019-02-12 15:15
 **/
public interface Account {
    Account openAccount();
    void showAccountType();
}