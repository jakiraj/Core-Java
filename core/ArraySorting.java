package core;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] number = {10, -3, 18, 5, 25};
        
        Arrays.sort(number);
        System.out.println("Ascending: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + number[i]);
        }
        
        System.out.println();
        System.out.println("Descending: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" " + number[i]);
        }
        
        System.out.println();
        String [] names = {"jakir", "raj", "hossain"};
        Arrays.sort(names);
        System.out.println("Ascending: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + names[i]);
        }
        System.out.println();
        System.out.println("Descending: ");
        for (int i = 2; i >= 0; i--) {
            System.out.print(" " + names[i]);
        }
    }
    
}
