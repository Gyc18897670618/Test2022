package com.vanke.test0623;

import java.util.*;

public class ShapeTest {

    public static void main(String[] args) {

        Shape shape1 = new Shape();
        Round round = new Round();
        Triangle triangle1 = new Triangle();
        doSuff(shape1);
        doSuff(round);
        doSuff(triangle1);


        System.out.println("-------------------------------------");
        Shape shape = new Round();
        shape.draw();
        shape.with();
        ((Round) shape).draw2();

        Triangle triangle = new Triangle();
        triangle.draw();

        System.out.println("--------------------");

        Vector vector = new Vector();
        HashMap<String, String> map = new HashMap<>();
        map.put("a","abc");

        vector.add(map);
        List<Object> list = new ArrayList<>();
        list.add("list");
        vector.add(list);
        vector.add("string");
        vector.add(123);

        System.out.println(vector);



    }

    static void doSuff(Shape s){
        s.draw();
    }

}