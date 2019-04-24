package com.javaDesign.designModel.creational.AbstractFactory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-21 17:30
 **/
public class KeyBoardApple extends KeyBoardFactory{
    void getKeyBoard() {
        System.out.println("生产苹果键盘");
    }
}