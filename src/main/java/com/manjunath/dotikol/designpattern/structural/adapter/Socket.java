package com.manjunath.dotikol.designpattern.structural.adapter;

public class Socket {

    private Volt volt;

    public Volt getVolt(){
        return new Volt(240);
    }


}
