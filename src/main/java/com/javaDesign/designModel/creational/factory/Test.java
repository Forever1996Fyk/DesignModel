package com.javaDesign.designModel.creational.factory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 16:48
 **/
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();
    }
}