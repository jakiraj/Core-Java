package oop.polymorphism;

public class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double area(){
        System.out.print("Area for Rectangle: ");
        return length * width;
    }
}
