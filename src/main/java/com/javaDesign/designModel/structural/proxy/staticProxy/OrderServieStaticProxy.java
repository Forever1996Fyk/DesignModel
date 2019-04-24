package com.javaDesign.designModel.structural.proxy.staticProxy;

import com.javaDesign.designModel.structural.proxy.IOrderService;
import com.javaDesign.designModel.structural.proxy.Order;
import com.javaDesign.designModel.structural.proxy.OrderServiceImpl;
import com.javaDesign.designModel.structural.proxy.db.DataSourceContextHolder;

/**
 * @program: designModel
 * @description: OrderServie的静态代理类
 * @author: YuKai Fan
 * @create: 2019-02-12 17:28
 **/
public class OrderServieStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        //增强IOrderService中的saveOrder方法，把这个方法单独出来，用beforeMethod和afterMethod来增强
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】");

        //todo 设置dataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}