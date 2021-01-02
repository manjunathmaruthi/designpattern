package com.manjunath.dotikol.designpattern.creational.singletone;

public class SingletoneClient {

    public static void main(String args[]){

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                ABC abc = ABC.getInstance();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                ABC abc = ABC.getInstance();
            }
        });

        thread1.start();
        thread2.start();
    }
}
