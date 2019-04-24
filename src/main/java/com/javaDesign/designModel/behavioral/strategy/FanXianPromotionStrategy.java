package com.javaDesign.designModel.behavioral.strategy;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 16:50
 **/
public class FanXianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到网站用户的余额中");
    }
}