package com.javaDesign.designModel.creational.Singleton;

/**
 * @program: designModel
 * @description: 懒汉式双重检查。既符合延迟加载，也保证了安全性能
 * @author: YuKai Fan
 * @create: 2018-12-04 14:35
 **/
public class LazyDoubleCheckSingleton {
    //volatile关键字，使用解决了程序的重排序问题，即使在多线程的情况下，实例变量始终是最新的状态
    //使用这种方法是不让下面的2，3发生重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton() {

    }
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置LazyDoubleCheckSingleton 只向刚分配的内存地址
                    //其中2和3的顺序可能会被颠倒，倒置，判断为null的时候，已经初始化对象，此时并不为空
                    //intra-thread semantics 不会改变单线程程序的重排序
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}