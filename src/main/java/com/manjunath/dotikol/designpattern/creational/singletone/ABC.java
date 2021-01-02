package com.manjunath.dotikol.designpattern.creational.singletone;

public class ABC {

    private ABC() {
        System.out.println("Instance created");
    }
    //static ABC abc = new ABC(); //Eager instantiation
    static ABC abc = null;

    public static ABC getInstance() {

        //Double check
        if (abc == null) {
            synchronized (ABC.class){
                if(abc == null) {
                    abc = new ABC();
                }
            }
        }
        return abc;
    }

}
