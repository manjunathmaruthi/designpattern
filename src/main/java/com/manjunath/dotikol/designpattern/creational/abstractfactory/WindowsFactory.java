package com.manjunath.dotikol.designpattern.creational.abstractfactory;


import com.manjunath.dotikol.designpattern.creational.factory.OS;
import com.manjunath.dotikol.designpattern.creational.factory.Windows;

public class WindowsFactory implements OSAbstractFactory {
    public OS getInstance() {
        return new Windows();
    }
}
