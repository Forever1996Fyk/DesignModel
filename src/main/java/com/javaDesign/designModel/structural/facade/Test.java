package com.javaDesign.designModel.structural.facade;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-17 10:21
 **/
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T shirt");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPoingtsPaymentService(new PoingtsPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointsGift);
    }
}