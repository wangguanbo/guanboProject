package com.guanbo.pattern.xiangyuan;

import java.util.HashMap;

/**
 * 享元模式：
 *      通过factory中的hashmap key取出对应的Flyweight的某一个具体实现
 */
public class Tets {
    public static void main(String[] args) {

        FlyweightFactory.getFlyweghtByFlag("A").option();
        FlyweightFactory.getFlyweghtByFlag("A").option();
        FlyweightFactory.getFlyweghtByFlag("c").option();
        FlyweightFactory.getFlyweghtByFlag("c").option();
        FlyweightFactory.getFlyweghtByFlag("c").option();
        System.out.println("hashMap长度为："+FlyweightFactory.getFLyweight());


    }
}
