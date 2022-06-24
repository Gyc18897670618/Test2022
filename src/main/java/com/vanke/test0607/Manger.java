package com.vanke.test0607;


import lombok.Data;

@Data
class Manager extends Employee {

    private String name;

    private double bonus;

    public int getInts1(int inte){
        return inte+2;
    }

    public String getInts(String inte){
        return inte+"2";
    }



}
