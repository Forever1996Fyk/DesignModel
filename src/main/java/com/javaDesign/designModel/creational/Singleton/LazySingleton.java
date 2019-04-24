package com.javaDesign.designModel.creational.Singleton;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: designModel
 * @description: 懒汉单例,懒汉式注重的就是延迟加载，当在使用到这个实例的时候才会初始化
 * @author: YuKai Fan
 * @create: 2018-12-04 14:04
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
//    private static boolean flag = true;
    private LazySingleton() {
        /*if (flag) {
            flag = false;
        } else {
            throw new RuntimeException("单例构造器禁止反射调用");
        }*/
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }
    //如果只有这种方法，是线程不安全的。
    //在多线程环境下，使用这个方法,会有概率的产生不止一个实例的情况，虽然最后返回的还是同样的对象
    /*public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }*/

    //在方法上加锁，让这个方法每次只能有一个线程访问
    /*public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }*/

    //在代码块上加锁，让这个方法每次只能有一个线程访问,这样只会产生一个实例
    //这种方式，锁的是class类，存在加锁和解锁的开销，对性能有一定影响
    public static LazySingleton getInstance() {
        synchronized(LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        /*Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton o1 = LazySingleton.getInstance();
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1, true);
        LazySingleton o2 = (LazySingleton) constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);*/
    }
}