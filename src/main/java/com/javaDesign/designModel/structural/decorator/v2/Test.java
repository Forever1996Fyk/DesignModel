package com.javaDesign.designModel.structural.decorator.v2;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 14:20
 **/
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 销售价格:" + aBattercake.cost());
    }
}