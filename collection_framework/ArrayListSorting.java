package collection_framework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(-5);
        number.add(8);
        number.add(0);
        number.add(3);
        System.out.println("before sorting: " + number);
        
        Collections.sort(number);
        System.out.println("after sorting in ascending: " + number);
        
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("after sorting in descending: " + number);
    }
    
}
