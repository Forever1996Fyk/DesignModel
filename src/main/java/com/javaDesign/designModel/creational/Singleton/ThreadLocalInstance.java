package com.javaDesign.designModel.creational.Singleton;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-12-11 15:17
 **/
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };
    private ThreadLocalInstance() {}

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }

}