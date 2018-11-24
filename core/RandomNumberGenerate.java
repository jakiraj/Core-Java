package core;

import java.util.Random;

public class RandomNumberGenerate {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*100)+1;
        System.out.println("Random number= " + randomNumber);
        
        //another way
//        Random rand = new Random();
//        int randomNumber = rand.nextInt(91) + 10; // 0 to 9
//        System.out.println("Random number= " + randomNumber);
    }
    
}
