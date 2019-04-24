package com.javaDesign.designModel.creational.Singleton;

/**
 * @program: designModel
 * @description: 使用静态内部类来防止多线程环境下对DoubleCheck的懒汉式单例模式的判断实例问题，同时也允许重排序
 * @author: YuKai Fan
 * @create: 2018-12-04 16:35
 **/
public class StaticInnerClassSingleton {
    //使用静态内部类，是基于class对象的初始化锁的延迟加载方式，在线程0执行方法时会去实例，即使发生重排序，线程1也会被锁在初始化阶段
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}