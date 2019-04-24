package com.javaDesign.designModel.structural.decorator.v1;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 14:08
 **/
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}