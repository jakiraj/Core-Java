package collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("size= " + number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        //print using for loop
//        for (int i : number){
//            System.out.print(i + " ");
//        }
        //print using Iterator 
//        Iterator itr = number.iterator();
//        while (itr.hasNext()) {
//            System.out.print(" " + itr.next());
//        }
        System.out.println("ArrayList contains: " + number);
        System.out.println();
        System.out.println("size= " + number.size());

        //get value in Array
//        int x = number.get(0);
//        System.out.println("index 0= " + x);

        //set value for replace in Array
//        number.set(3, 50);
//        System.out.println("after setting: " + number);

        //Check Index of value
//        int pos = number.indexOf(30);
//        System.out.println("The index of 30 is: " + pos);

        //ArrayList check value
//        boolean contain = number.contains(30);
//        System.out.println("30 is in the list: " + contain);

        //Arraylist empty?
//        boolean check = number.isEmpty();
//        System.out.println("ArrayList empty: " + check);

        //removing elements
//        number.remove(2);
//        System.out.println("After removing ArrayList contains: " + number);
//        System.out.println();
//        System.out.println("size= " + number.size());

        //remove all elements
//        number.removeAll(number);
//        System.out.println("size= " + number.size());

        //clear methods
//        number.clear();
//        System.out.println("after clear ArrayList contains: " + number);
    }

}
