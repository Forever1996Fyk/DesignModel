package com.javaDesign.designModel.structural.proxy.dynamicproxy;

import com.javaDesign.designModel.structural.proxy.IOrderService;
import com.javaDesign.designModel.structural.proxy.Order;
import com.javaDesign.designModel.structural.proxy.OrderServiceImpl;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 10:34
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}