package com.javaDesign.designModel.creational.Prototype.abstractPrototype;

/**
 * @program: designModel
 * @description: 通过抽象类，实现原型模式
 * @author: YuKai Fan
 * @create: 2018-12-13 16:31
 **/
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}