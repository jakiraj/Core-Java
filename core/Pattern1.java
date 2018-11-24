package core;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter line numbers: ");
        int n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }
    
}
