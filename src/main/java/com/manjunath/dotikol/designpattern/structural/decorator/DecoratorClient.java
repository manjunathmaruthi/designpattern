package com.manjunath.dotikol.designpattern.structural.decorator;

public class DecoratorClient {
    public static void main(String[] args) {

        CourtBooking courtBooking = null;
        courtBooking = new RacketPack(new WoodenCourt());
        courtBooking = new Coaching(courtBooking);
        System.out.println(courtBooking.cost());
    }
}
