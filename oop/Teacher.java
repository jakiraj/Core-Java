package oop;

public class Teacher {

    String name, gender;
    int phone;

    public Teacher() {
        System.out.println("No Value");
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
