package com.javaDesign.designModel.structural.facade;

/**
 * @program: designModel
 * @description: 积分支付系统
 * @author: YuKai Fan
 * @create: 2018-12-17 10:13
 **/
public class PoingtsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }
}