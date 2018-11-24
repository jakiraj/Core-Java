package oop.abstraction;

public class Test {

    public static void main(String[] args) {
        MobileUser mu;
        mu = new Raj();
        mu.sendMessage();
        
        mu = new Abir();
        mu.sendMessage(); 
    }
    
}
