package com.manjunath.dotikol.designpattern.structural.decorator;

public abstract class BadmintonDecorator extends CourtBooking {

    CourtBooking courtBooking;

    public BadmintonDecorator(CourtBooking courtBooking){
        this.courtBooking = courtBooking;
    }
    @Override
    public int cost(){
        return courtBooking.cost();
    }
}
