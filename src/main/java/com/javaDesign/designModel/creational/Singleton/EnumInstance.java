package com.javaDesign.designModel.creational.Singleton;

/**
 * @program: designModel
 * @description: 使用枚举实现单例
 * @author: YuKai Fan
 * @create: 2018-12-05 15:55
 **/
public enum EnumInstance {
    INSTANCE{
        protected void printTest() {
            System.out.println("Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}