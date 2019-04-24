package com.javaDesign.principle.singleresponsibility;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 14:27
 **/
public class Method {

    private void updateUserInfo(String userName, String address) {
        userName = "fyk";
        address = "anhui";
    }

    private void updateUserInfo(String userName, String ... properties) {
        userName = "fyk";
    }
}