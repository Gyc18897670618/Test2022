package com.vanke.test0620;

public class AnimalImpl implements Dog {
    @Override
    public void eat() {
        System.out.println("吃屎");
    }

    @Override
    public void special() {
        System.out.println("看家");
    }
}
