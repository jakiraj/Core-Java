package oop.polymorphism;

public class Triangle extends Shape{
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area(){
        System.out.print("Area for Triangle: ");
        return base * height;
    }
}
