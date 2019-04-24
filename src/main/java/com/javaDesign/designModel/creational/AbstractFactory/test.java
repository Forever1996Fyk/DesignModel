package com.javaDesign.designModel.creational.AbstractFactory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-21 17:34
 **/
public class test {
    public static void main(String[] args) {
        AbstractFactory appleFactory = new AppleFactory();
        AbstractFactory lenovoFactory = new LenovoFactory();

        KeyBoardFactory keyBoardFactory = appleFactory.keyBoard();
        KeyBoardFactory keyBoardFactory1 = lenovoFactory.keyBoard();

        MouseFactory mouse = appleFactory.mouse();
        MouseFactory mouse1 = lenovoFactory.mouse();

        keyBoardFactory.getKeyBoard();
        keyBoardFactory1.getKeyBoard();

        mouse.getMouse();
        mouse1.getMouse();
    }
}