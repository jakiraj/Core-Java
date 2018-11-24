package oop;

public class Test {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Jakir Hossain", "Male", 1515236127);// create
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Raj Hossain", "Male", 1738151934);// create
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher();// create
        teacher3.displayInformation();

    }

}
