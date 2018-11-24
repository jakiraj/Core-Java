package core;


import java.util.Scanner;

public class TemperatureFtoC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcious, fahrenheit;
        
        System.out.print("Enter fahrenheit: ");
        fahrenheit = input.nextDouble();
        
        
        celcious = 0.55 * (fahrenheit - 32);
        
        System.out.print("Fahrenheit: " + celcious);
    }
    
}
