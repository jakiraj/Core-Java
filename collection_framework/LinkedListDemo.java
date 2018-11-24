package collection_framework;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();
        countryNames.add("Afghanistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(5, "Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("China");
        
        for(String country : countryNames){
            System.out.println(country);
        }
        System.out.println("Size of the LinkedList: " + countryNames.size());
    }
    
}
