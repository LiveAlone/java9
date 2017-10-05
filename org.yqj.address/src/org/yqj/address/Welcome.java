package org.yqj.address;

public class Welcome {

    public static void main(String[] args) {
        Class<Welcome> clz = Welcome.class;
        Module module = clz.getModule();
        String moduleName = module.getName();
        System.out.println("current module name is " + moduleName);
    }

}
