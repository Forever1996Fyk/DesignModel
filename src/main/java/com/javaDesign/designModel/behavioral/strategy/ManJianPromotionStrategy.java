package com.javaDesign.designModel.behavioral.strategy;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 16:49
 **/
public class ManJianPromotionStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("满减促销，满200减20元");
    }
}