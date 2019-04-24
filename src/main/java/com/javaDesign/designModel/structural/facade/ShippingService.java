package com.javaDesign.designModel.structural.facade;

/**
 * @program: designModel
 * @description: 物流系统
 * @author: YuKai Fan
 * @create: 2018-12-17 10:15
 **/
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}