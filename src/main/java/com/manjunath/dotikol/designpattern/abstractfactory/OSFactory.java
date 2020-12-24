package com.manjunath.dotikol.designpattern.abstractfactory;

import com.manjunath.dotikol.designpattern.factory.OS;

public class OSFactory {

    public OS getSpec(OSAbstractFactory factory){
        return factory.getInstance();
    }
}
