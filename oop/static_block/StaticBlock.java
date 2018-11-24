package oop.static_block;

public class StaticBlock {
    static int id;
    static String name;

    static{
        id = 101;
        name = "Jakir";
    }
    
    static void display(){
        System.out.println("id: " + id);
        System.out.println("Name: " + name);
    }
    
}
