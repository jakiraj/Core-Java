package core;

import java.util.Scanner;

public class EvenFrommTon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m, n;
        System.out.print("Enter initial number: ");
        m = input.nextInt();

        System.out.print("Enter final number: ");
        n = input.nextInt();

//        //all value sumation 
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }

        //all even value sumation 
//        for (int i = m; i <= n; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//                System.out.println(" " + i);
//            }
//        }
        
        //all odd value sumation 
//        for (int i = m; i <= n; i++) {
//            if (i % 2 != 0) {
//                sum = sum + i;
//                System.out.println(" " + i);
//            }
//        }
        System.out.print("The sum is: " + sum);
    }

}
