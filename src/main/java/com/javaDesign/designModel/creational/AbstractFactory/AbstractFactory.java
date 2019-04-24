package com.javaDesign.designModel.creational.AbstractFactory;

/**
 * @program: designModel
 * @description: PC工厂，用于生产一个产品族
 * @author: YuKai Fan
 * @create: 2018-11-21 16:37
 **/
public abstract class AbstractFactory {

    abstract KeyBoardFactory keyBoard();
    abstract MouseFactory mouse();
}