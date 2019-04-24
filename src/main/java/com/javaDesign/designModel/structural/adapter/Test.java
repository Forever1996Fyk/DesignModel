package com.javaDesign.designModel.structural.adapter;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 16:19
 **/
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}