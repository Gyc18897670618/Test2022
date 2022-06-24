package com.vanke.test0623;


import java.util.ArrayList;
import java.util.List;

public class GenericErase {
    public static void main(String[] args) {
        ArrayList<Integer> integerList =  new ArrayList();
        integerList.add(123);
        List<String> stringList =  new ArrayList();
        stringList.add("123");
        System.out.println(integerList.getClass() == stringList.getClass());

        //通过反射添加元素
        try {
            integerList.getClass().getMethod("add",Object.class).invoke(integerList,"abc");
        }catch (Exception e){
            System.out.println("异常");
        }

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }



    }




}
