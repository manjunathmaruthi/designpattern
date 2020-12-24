package com.manjunath.dotikol.designpattern.builder;

public class BuilderClient {

    public static void main(String args[]){

        Computer computer = new Computer.Builder(16,"windows","segate")
                .setBluetooth(true)
                .build();
        System.out.println(computer);

    }
}
