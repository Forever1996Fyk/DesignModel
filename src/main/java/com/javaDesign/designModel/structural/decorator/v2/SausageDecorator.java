package com.javaDesign.designModel.structural.decorator.v2;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 14:18
 **/
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}