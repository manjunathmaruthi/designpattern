package com.manjunath.dotikol.designpattern.structural.decorator;

public class Coaching extends BadmintonDecorator {

    public Coaching(CourtBooking courtBooking) {
        super(courtBooking);
    }

    public int cost(){
        return super.cost() + 120;
    }
}
