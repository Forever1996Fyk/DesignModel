package com.javaDesign.principle.singleresponsibility;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 14:18
 **/
public class Test {

    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("驼鸟");
    }
}