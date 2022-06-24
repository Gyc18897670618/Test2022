package com.vanke.test0623;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Integer> stackInt = new Stack<>();
        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        while (!stackInt.isEmpty()){
            Integer pop = stackInt.pop();
            System.out.println(pop);
        }

    }
}
