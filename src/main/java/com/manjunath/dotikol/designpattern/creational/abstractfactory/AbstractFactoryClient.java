package com.manjunath.dotikol.designpattern.creational.abstractfactory;

import com.manjunath.dotikol.designpattern.creational.factory.OS;

public class AbstractFactoryClient {

    public static void main(String args[]){
        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getSpec(new AndroidFactory());
        System.out.println(os.getSpec());

    }
}
