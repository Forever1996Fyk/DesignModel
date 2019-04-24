package com.javaDesign.designModel.creational.factory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-21 11:05
 **/
public class JavaVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new JavaVideo();
    }
}