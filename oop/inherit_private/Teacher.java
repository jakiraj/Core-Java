package oop.inherit_private;


public class Teacher extends Person{
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void displayInformation(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }
}
