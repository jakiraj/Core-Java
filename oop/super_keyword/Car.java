package oop.super_keyword;

public class Car extends Vehicle {
    int gear;

    public Car(int gear, String color, double weight) {
        super(color, weight);
        this.gear = gear;
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Gear: " + gear);
    }
}
