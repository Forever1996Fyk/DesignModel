package com.javaDesign.designModel.structural.facade;

/**
 * @program: designModel
 * @description: 积分礼物
 * @author: YuKai Fan
 * @create: 2018-12-17 10:11
 **/
public class PointsGift {
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}