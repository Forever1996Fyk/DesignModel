package com.javaDesign.designModel.structural.adapter.objectAdapter;


/**
 * @program: designModel
 * @description: 通过组合的方式，把具体实现request的方法委托给Adaptee来实现
 * @author: YuKai Fan
 * @create: 2019-02-11 16:03
 **/
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    public void request() {
        //...
        adaptee.AdapteeRequest();
        //...
    }
}