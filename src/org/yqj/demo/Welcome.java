package org.yqj.demo;

/**
 * Created by yaoqi on 2017/07/04.
 */
public class Welcome {
    public static void main(String[] args) {
        Class<Welcome> cls = Welcome.class;
        Module mod = cls.getModule();
        String moduleName = mod.getName();
        System.out.format("Module Name: %s%n", moduleName);
    }
}
