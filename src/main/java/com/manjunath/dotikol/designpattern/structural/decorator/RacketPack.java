package com.manjunath.dotikol.designpattern.structural.decorator;

public class RacketPack extends BadmintonDecorator {



    public RacketPack(CourtBooking courtBooking){
        super(courtBooking);
    }
    public int cost() {
        return 50 + super.cost();
    }
}
