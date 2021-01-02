package com.manjunath.dotikol.designpattern.structural.adapter;

public class SocketAdapter {

    private Socket socket;

    public Volt getMobileVolt(){
        return convertToMobileVolt(socket.getVolt().volt);
    }

    public static Volt convertToMobileVolt(int volt){
        //do something
        return new Volt(3);
    }
}
