package com.javaDesign.designModel.creational.factory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-21 11:08
 **/
public class FEVideoFactory extends VideoFactory {
    public Video getVideo() {
        return new FEVideo();
    }
}