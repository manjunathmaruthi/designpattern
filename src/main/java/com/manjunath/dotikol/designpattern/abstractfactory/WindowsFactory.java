package com.manjunath.dotikol.designpattern.abstractfactory;


import com.manjunath.dotikol.designpattern.factory.OS;
import com.manjunath.dotikol.designpattern.factory.Windows;

public class WindowsFactory implements OSAbstractFactory {
    public OS getInstance() {
        return new Windows();
    }
}
