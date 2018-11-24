package oop.static_variable;

public class Student {
    static int count = 0; //non static e result 1 asbe

    public Student() {
        count++;
    }
    
    void totalStudent(){
        System.out.println("Total student = " + count);
    }
}
