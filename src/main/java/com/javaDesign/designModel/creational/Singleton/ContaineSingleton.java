package com.javaDesign.designModel.creational.Singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: designModel
 * @description: 容器单例模式
 * @author: YuKai Fan
 * @create: 2018-12-11 14:59
 **/
public class ContaineSingleton {
    private ContaineSingleton() {}
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public  static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}