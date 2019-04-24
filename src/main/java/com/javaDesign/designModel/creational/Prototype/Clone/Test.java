package com.javaDesign.designModel.creational.Prototype.Clone;

import com.javaDesign.designModel.creational.Singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-13 16:34
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Date birthDay = new Date(0L);
//        Pig pig = new Pig("佩奇", birthDay);
//        Pig pig1 = (Pig) pig.clone();
//        System.out.println(pig);
//        System.out.println(pig1);
//
//        pig.getBirthDay().setTime(6666666666666L);
//        /**
//         * 通过上面对birthDay进行操作，如果是浅拷贝，那么pig与pig1的date对象都会改变：
//         *  因为在浅拷贝的时候，两个对象中的引用对象date，都是引用同一个对象，所以改变了一个，那么两个都会改变
//         *
//         * 如果是深拷贝，那么pig与pig1引用的date对象就是不一样的，改变其中一个，对另一个并没有影响。
//         *
//         * 由于深克隆，浅克隆的关系，也算是原型模式的一个坑。(原则是，都会使用深克隆，不然就算是给项目埋坑)
//         *
//         */
//        System.out.println(pig);
//        System.out.println(pig1);

        /**
         * 使用原型模式，克隆破坏单例模式
         *
         * 这种情况的解决方式：
         * 要么单例模式类不去实现Cloneable接口，要么就重写clone方法，直接返回getInstance()方法，这个对象的实例
         */
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}