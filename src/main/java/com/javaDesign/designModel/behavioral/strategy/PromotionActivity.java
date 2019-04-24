package com.javaDesign.designModel.behavioral.strategy;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 16:51
 **/
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}