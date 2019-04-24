package com.javaDesign.designModel.structural.adapter;

/**
 * @program: designModel
 * @description: 220v的交流电
 * @author: YuKai Fan
 * @create: 2019-02-11 16:13
 **/
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出交流电" + output + "V");
        return output;
    }
}