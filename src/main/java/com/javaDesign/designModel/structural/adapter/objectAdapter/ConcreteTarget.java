package com.javaDesign.designModel.structural.adapter.objectAdapter;


/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-11 16:03
 **/
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}