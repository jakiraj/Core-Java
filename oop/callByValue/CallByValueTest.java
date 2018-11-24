package oop.callByValue;

public class CallByValueTest {

    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
        int x = 10;
        System.out.println("x befor call: " + x);
        
        obj.change(x);
        System.out.println("x after call: " + x);
    }
    
}
