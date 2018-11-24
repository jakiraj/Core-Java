package core;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] names = {"Jakir", "Raj", "Hossain", "Abir"};
        
        for (String x : names) {
            System.out.println(x);
        }
        
        int[] num = {11,15,12,14,18,16,20,25,23,28,23,50};
        int sum = 0;
        for(int x : num){
            sum = sum + x;
        }
        System.out.println("Total Summation is: " + sum);
    }
    
}
