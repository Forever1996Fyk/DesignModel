package com.javaDesign.designModel.structural.adapter.classAdapter;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 16:03
 **/
public class Adapter extends Adaptee implements Target {
    public void request() {
        //...可以加上逻辑
        super.AdapteeRequest();
        //...可以加上逻辑
    }
}