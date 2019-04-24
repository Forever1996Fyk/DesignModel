package com.javaDesign.designModel.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: designModel
 * @description: 促销策略工厂的实现
 * @author: YuKai Fan
 * @create: 2019-02-13 17:10
 **/
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getNonPromotion(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}