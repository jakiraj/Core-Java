package core;


import java.util.Scanner;

public class AreaofTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, area;
        
        System.out.print("Enter base: ");
        base = input.nextDouble();
        
        System.out.print("Enter height: ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        
        System.out.print("Area of Triangle: " + area);
    }
    
}
