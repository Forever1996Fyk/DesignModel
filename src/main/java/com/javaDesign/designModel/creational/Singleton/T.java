package com.javaDesign.designModel.creational.Singleton;

import ch.qos.logback.classic.filter.ThresholdFilter;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-04 14:11
 **/
public class T implements Runnable {
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + "" + lazyDoubleCheckSingleton);
//        ContaineSingleton.putInstance("object", new Object());
//        Object instance = ContaineSingleton.getInstance("object");
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + "" + instance);

    }
}