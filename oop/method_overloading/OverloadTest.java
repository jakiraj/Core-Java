package oop.method_overloading;

public class OverloadTest {

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.add();
        obj.add(5, 10);
        obj.add(5.5, 9.5);
        obj.add(5, 6, 9);
        
    }
    
}
