package com.vanke.test0607;

import lombok.Data;

@Data
public class Employee {

    private final StringBuffer string = new StringBuffer();

    private int id;

    private Integer age;

    private static String peculiarity;

    private static Double weight;

    //静态代码块只能给静态属性（方法也可以,静态方法中不能给静态属性赋值）赋值
    static {
        peculiarity= "勇敢";
    }
    //初始化代码块可以给静态和非静态属性(方法也可以)赋值。
    {
        age=20;
        peculiarity= "勇敢";
        this.setId(1);
    }




}
