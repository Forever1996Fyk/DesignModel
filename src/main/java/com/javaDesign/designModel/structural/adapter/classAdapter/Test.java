package com.javaDesign.designModel.structural.adapter.classAdapter;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 16:05
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}