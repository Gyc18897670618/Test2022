package com.vanke.test0623;


import java.util.concurrent.locks.ReentrantLock;



public class ThredTest {

    public static void main(String[] args) {
        Thread thread = new Thread();

        thread.start();


        ReentrantLock reentrantLock = new ReentrantLock();

        try {
            reentrantLock.lock();
        }catch (Exception e){


        }finally {
            reentrantLock.unlock();
        }




    }
}
