package com.javaDesign.designModel.creational.AbstractFactory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-21 16:57
 **/
public class MouseApple extends MouseFactory {
    void getMouse() {
        System.out.println("生产Apple鼠标");
    }
}