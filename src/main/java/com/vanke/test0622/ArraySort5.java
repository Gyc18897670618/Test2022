package com.vanke.test0622;

import java.util.ArrayList;
import java.util.List;

public class ArraySort5 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        remove5(list);
    }

    public static void remove5(List<Integer> list){

            if (list.size()==5){
                System.out.println("最后的结果：" + list.get(4));
            }else if (list.size()>5) {

                    for (int i = 1; i < list.size(); i++) {
                        if (i % 5 == 0) {
                            list.remove(i);
                        }
                    System.out.println(list);
                }
        }
        while (list.size()>5){
            remove5(list);
        }
        System.out.println(list);
    }
}
