package oop.static_keyword;

public class Student {
    String name;
    int id;
    static String universityName = "NU";

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("University Name: " + universityName);
    }
}
