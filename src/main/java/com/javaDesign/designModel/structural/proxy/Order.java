package com.javaDesign.designModel.structural.proxy;

/**
 * @program: designModel
 * @description: 订单实体
 * @author: YuKai Fan
 * @create: 2019-02-12 17:21
 **/
public class Order {
    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}