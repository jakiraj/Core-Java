package core;

import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
        System.out.print("Enter Initial number: ");
        m = input.nextInt();

        System.out.print("Enter Final number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println("\n");
        }
//        for 1 value
//        int num;
//        System.out.print("Enter any number: ");
//        num = input.nextInt();
//        
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " x " + i + " = " + num * i);
//        }
    }

}
