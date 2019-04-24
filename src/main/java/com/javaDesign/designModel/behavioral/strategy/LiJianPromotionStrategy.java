package com.javaDesign.designModel.behavioral.strategy;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 16:48
 **/
public class LiJianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}