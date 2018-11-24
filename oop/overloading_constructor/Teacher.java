package oop.overloading_constructor;

public class Teacher {
    String name, gender;
    int phone;

    public Teacher() {
        System.out.println("No information");
    }

    public Teacher(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Teacher(String name, String gender, int phone) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }
    
    void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
    }
    
    
}

