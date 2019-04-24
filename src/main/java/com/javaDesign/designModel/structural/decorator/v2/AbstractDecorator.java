package com.javaDesign.designModel.structural.decorator.v2;

/**
 * @program: designModel
 * @description: 这是抽象的装饰类，但是并没有被abstract修饰，
 *      这个类是否是抽象类，需要看业务场景。如果加上abstract作为抽象的类，能保证子类必须实现某个方法 doSomething()方法才会有意义
 *      举个例子，如果在加鸡蛋或者加香肠的时候都会有一个动作，而这个动作，分别用于各自的装饰者实现，那对于两个实体的装饰者的父类用抽象的装饰者，才会有意义。
 * @author: YuKai Fan
 * @create: 2019-02-11 14:15
 **/
public class AbstractDecorator extends ABattercake  {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    //protected  abstract void doSomething();

    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    protected int cost() {
        return this.aBattercake.cost();
    }
}