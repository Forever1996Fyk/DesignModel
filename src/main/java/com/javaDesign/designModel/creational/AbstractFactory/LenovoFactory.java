package com.javaDesign.designModel.creational.AbstractFactory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-21 17:33
 **/
public class LenovoFactory extends AbstractFactory {
    KeyBoardFactory keyBoard() {
        return new KeyBoardLenovo();
    }

    MouseFactory mouse() {
        return new MouseLenovo();
    }
}