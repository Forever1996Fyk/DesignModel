package com.javaDesign.designModel.structural.decorator.v2;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 14:14
 **/
public class Battercake extends ABattercake {
    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}