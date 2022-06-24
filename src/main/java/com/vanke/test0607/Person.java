package com.vanke.test0607;

//抽象类
public abstract class Person {
    private String name;
    private static Integer age = 10;
    public Person(String name){
        this.name=name;
    }
    //抽象方法
    public abstract String getDescription();

    public String getName(){
        return name;
    }
}
