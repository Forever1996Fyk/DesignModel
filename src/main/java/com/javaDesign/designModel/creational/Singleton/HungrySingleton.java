package com.javaDesign.designModel.creational.Singleton;

import java.io.Serializable;

/**
 * @program: designModel
 * @description: 饿汉式，与懒汉式最大的区别，就是延时加载，但是饿汉式如果不用该实例，会占用资源
 * @author: YuKai Fan
 * @create: 2018-12-04 16:57
 **/
public class HungrySingleton implements Serializable, Cloneable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}