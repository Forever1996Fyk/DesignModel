package com.javaDesign.designModel.structural.proxy;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-12 17:24
 **/
public class OrderDaoImpl implements IOrderDao {
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}