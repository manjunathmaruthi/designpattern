package com.manjunath.dotikol.designpattern.factory;

public class OSFactory {

    public OS getSpec(String osName){
        if(osName.equalsIgnoreCase("Android")){
            return new Android();
        } else if(osName.equalsIgnoreCase("IOS")){
            return new IOS();
        }
        return new Windows();
    }
}
