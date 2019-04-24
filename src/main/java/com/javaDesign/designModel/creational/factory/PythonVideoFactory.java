package com.javaDesign.designModel.creational.factory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-21 11:06
 **/
public class PythonVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new PythonVideo();
    }
}