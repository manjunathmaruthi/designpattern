package com.manjunath.dotikol.designpattern.factory;

public class FactoryClient {

    public static void main(String args[]){
        OSFactory osFactory = new OSFactory();
        String osName = "abc";
        osFactory.getSpec(osName);
        OS os =  osFactory.getSpec(osName);
        System.out.println(os.getSpec());

    }
}
