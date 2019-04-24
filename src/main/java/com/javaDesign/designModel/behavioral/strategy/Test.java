package com.javaDesign.designModel.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 16:52
 **/
public class Test {
    public static void main(String[] args) {
        /*//在618的时候，使用立减策略
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        //在双11的时候，使用满减策略
        PromotionActivity promotionActivity1111 = new PromotionActivity(new ManJianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();*/

        /**
         * 改进
         */

//        PromotionActivity promotionActivity = null;
//
//        //创建一个promotionKey
//        String promotionKey = "LIJIAN";
//        if (StringUtils.equals(promotionKey, "LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (StringUtils.equals(promotionKey, "FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }//....
//
//        promotionActivity.executePromotionStrategy();

        /**
         * 策略模式与工厂模式结合
         */
        String promotionKey = "LIJIAN";

        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getNonPromotion(promotionKey));
        promotionActivity.executePromotionStrategy();

    }
}