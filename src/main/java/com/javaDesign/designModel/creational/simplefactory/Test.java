package com.javaDesign.designModel.creational.simplefactory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 16:48
 **/
public class Test {
    public static void main(String[] args) {
        /*Video video = new JavaVideo();
        video.product();*/
        /*VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo("java");
        if (java == null) {
            return;
        }
        java.product();*/
        VideoFactory videoFactory = new VideoFactory();
        Video java = videoFactory.getVideo(JavaVideo.class);
        if (java == null) {
            return;
        }
        java.product();
    }
}