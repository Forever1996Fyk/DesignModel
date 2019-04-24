package com.javaDesign.designModel.creational.simplefactory;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 16:50
 **/
public class VideoFactory {
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return video;
    }

    /*public Video getVideo(String type) {

        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();

        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();

        }
        return null;
    }*/
}