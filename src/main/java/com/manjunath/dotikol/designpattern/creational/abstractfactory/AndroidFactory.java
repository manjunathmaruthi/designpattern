package com.manjunath.dotikol.designpattern.creational.abstractfactory;

import com.manjunath.dotikol.designpattern.creational.factory.Android;
import com.manjunath.dotikol.designpattern.creational.factory.OS;

public class AndroidFactory implements OSAbstractFactory{
    public OS getInstance() {
        return new Android();
    }
}
