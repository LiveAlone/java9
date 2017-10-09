package org.yqj.demo;

public class Welcome {
    public static void welcome(String[] args) {
        System.out.println("Welcome to the Module System.");
        // Print the module name of the Welcome class
        Class<Welcome> cls = Welcome.class;
        Module mod = cls.getModule();
        String moduleName = mod.getName();
        System.out.format("Module Name: %s%n", moduleName);
    }
}
