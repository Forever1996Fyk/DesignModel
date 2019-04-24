package com.javaDesign.designModel.structural.facade;

/**
 * @program: designModel
 * @description: 校验系统
 * @author: YuKai Fan
 * @create: 2018-12-17 10:12
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过，库存通过");
        return true;
    }
}