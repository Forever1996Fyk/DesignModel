package com.javaDesign.designModel.structural.decorator.v1;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 14:04
 **/
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}