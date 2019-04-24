package com.javaDesign.designModel.structural.proxy;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 17:23
 **/
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;



    public int saveOrder(Order order) {
        //Spring会自己注入，但是并没有集成spring
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}