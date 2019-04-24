package com.javaDesign.designModel.behavioral.templatemethod;

/**
 * @program: designModel
 * @description:
 * @author: YuKai Fan
 * @create: 2019-02-13 14:56
 **/
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材等");
    }

    //这样的写法是为了满足不同的前端课程，可能jquery需要写手记，而html/css不需要写
    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}