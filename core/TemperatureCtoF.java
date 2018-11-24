package core;


import java.util.Scanner;

public class TemperatureCtoF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcious, fahrenheit;
        
        System.out.print("Enter celcious: ");
        celcious = input.nextDouble();
        
        
        fahrenheit = 1.8 * celcious + 32;
        
        System.out.print("Fahrenheit: " + fahrenheit);
    }
    
}
