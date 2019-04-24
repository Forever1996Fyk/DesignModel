package com.javaDesign.designModel.creational.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @program: designModel
 * @description: 通过反射，来获取新的实例，破坏单例模式
 * @author: YuKai Fan
 * @create: 2018-12-05 14:55
 **/
public class Test3 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {

        /**
         * 下面这两种，都是在类加载，或者是静态内部类加载的时候，就产生实例
         */
        //饿汉式
       /* Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        //通过反射，将类的构造器权限改为了public，这样就这样new出新的实例
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

       //静态内部类
        /*Class objectClass = StaticInnerClassSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        //通过反射，将类的构造器权限改为了public，这样就这样new出新的实例
        constructor.setAccessible(true);
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

        /**
         * 下面这种是延时加载
         */
        /*懒汉式
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        //通过反射，将类的构造器权限改为了public，这样就这样new出新的实例
        constructor.setAccessible(true);
        //如果按照上面两种方式在类加载的时候判断，依旧会就会产生不同的实例
        *//*
            可以看出，这跟创建实例的顺序是有关的，
            如果先执行LazySingleton.getInstance()方法，由于getInstance是同步的，就会先拿到实例，后面反射在获取实例时，此时单例对象已经存在，就会抛出异常
            在多线程环境下，如果获取单例一个线程后执行，反射单例一个线程先执行，那就会产生两个不同的实例
         *//*
        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/

        /**
         * 枚举类型的单例模式下的，反射与序列化攻击
         */
        /*EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
          *//*
            ObjectInputStream中有一个readEnum()方法，这是读取枚举类的方法，它会获取到枚举对象的名称name，
            String name = readString(false);
            Enum<?> result = null;
            Class<?> cl = desc.forClass();
            if (cl != null) {
                try {
                    @SuppressWarnings("unchecked")
                    //根据name获取到枚举常量,由于name是唯一的，并且对应一个枚举常量，所以对于枚举类，实例也只会产生一个，所以枚举类对于序列化的破坏是不受影响的
                    Enum<?> en = Enum.valueOf((Class)cl, name);
                    result = en;
                }
           *//*
        EnumInstance newInstance = (EnumInstance)ois.readObject();
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());*/
        Class objectClass = EnumInstance.class;
        /*
            因为枚举类中是没有无参构造器的，所以必须要传两个参数
         */
        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
        //通过反射，将类的构造器权限改为了public，这样就这样new出新的实例
        constructor.setAccessible(true);
        EnumInstance instance = EnumInstance.getInstance();
        EnumInstance newInstance = (EnumInstance) constructor.newInstance("测试",666);
        /*
            通过反射来获取实例时，会有一个判断，看是否是枚举类，如果是的话就会抛出异常，这样反射攻击也会失败
            newInstance():
                if ((clazz.getModifiers() & Modifier.ENUM) != 0)
                 throw new IllegalArgumentException("Cannot reflectively create enum objects");
         */
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

        /*EnumInstance instance1 = EnumInstance.getInstance();
        instance1.printTest();

        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        //通过反射，将类的构造器权限改为了public，这样就这样new出新的实例
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);*/


    }
}