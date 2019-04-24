package com.javaDesign.designModel.behavioral.strategy;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 17:10
 **/
public class EmptyPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销");
    }
}