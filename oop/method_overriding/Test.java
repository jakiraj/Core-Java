package oop.method_overriding;

public class Test {

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Jakir";
        t1.age = 25;
        t1.qualification = "PGD in J2EE";
        t1.displayInformation();
        
        Person p1 = new Person();
        p1.name = "Raj";
        p1.age = 25;
        p1.displayInformation();
    }
    
}
