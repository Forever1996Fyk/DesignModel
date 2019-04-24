package com.javaDesign.designModel.behavioral.templatemethod;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 14:50
 **/
public abstract class ACourse {
    //不希望子类覆盖这个方法，防止修改方法里面的录制课程流程的执行顺序
    protected final void makeCourse() {
        this.makePPT();
        this.makeVide0();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVide0() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}