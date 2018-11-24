package oop.callByReference;

public class CallByReference {
    String name;
    void change(CallByReference r2){
        r2.name = "Jakir";
    }
}
