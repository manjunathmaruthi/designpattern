package com.manjunath.dotikol.designpattern.abstractfactory;

import com.manjunath.dotikol.designpattern.factory.Android;
import com.manjunath.dotikol.designpattern.factory.OS;

public class AndroidFactory implements OSAbstractFactory{
    public OS getInstance() {
        return new Android();
    }
}
