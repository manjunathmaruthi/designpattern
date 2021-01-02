package com.manjunath.dotikol.designpattern.creational.abstractfactory;

import com.manjunath.dotikol.designpattern.creational.factory.OS;

public class OSFactory {

    public OS getSpec(OSAbstractFactory factory){
        return factory.getInstance();
    }
}
