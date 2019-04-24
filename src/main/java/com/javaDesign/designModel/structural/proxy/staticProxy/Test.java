package com.javaDesign.designModel.structural.proxy.staticProxy;

import com.javaDesign.designModel.structural.proxy.Order;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 17:48
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServieStaticProxy orderServieStaticProxy = new OrderServieStaticProxy();
        orderServieStaticProxy.saveOrder(order);
    }
}