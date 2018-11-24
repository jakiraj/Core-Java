package problem_solving3;

import java.util.Scanner;

public class ExceptionProblemDemo {

    public static void main(String[] args) {
        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter num1: ");
                int num1 = input.nextInt();
                System.out.print("Please enter num2: ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result: " + num1 + "/" + num2 + " = " + result);
                count = 2;
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("You must enter integer. Please try again");
            }
        }while (count == 1);
    }
}
//Please enter num1: 100
//Please enter num2: 7
//Result: 100/7 = 14
//Please enter num1: 100
//Please enter num2: hello
//Exception: java.util.InputMismatchException
//You must enter integer. Please try again
//Please enter num1: 100
//Please enter num2: 0
//Exception: java.lang.ArithmeticException: / by zero
//You must enter integer. Please try again