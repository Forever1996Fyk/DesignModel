package com.javaDesign.designModel.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: designModel
 * @description: 课程目录类
 * @author: YuKai Fan
 * @create: 2019-02-12 11:41
 **/
public class CourseCatalog extends CatalogComponent{
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print(" ");
                }
            }
            catalogComponent.print();
        }
    }
}