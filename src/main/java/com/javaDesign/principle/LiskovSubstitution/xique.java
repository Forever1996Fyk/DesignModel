package com.javaDesign.principle.LiskovSubstitution;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2018-11-13 16:19
 **/
public class xique extends bird {
    public void fly(Integer l) {

    }

    public String fly(Long l) {
        return "aaa";
    }
}