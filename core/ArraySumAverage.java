package core;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] number = new double[5];
        double sum = 0;
        System.out.print("Please Enter 5 numbers: ");
        
        //for number input
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
        //for sum
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("The sum is: " + sum);
        
        double avg = sum/number.length;
        System.out.print("The average is: " + avg);
    }
    
}
