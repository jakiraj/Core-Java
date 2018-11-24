package oop.overloading_constructor;

public class OverloadingConstructorTest {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Jakir", "Male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("Jakir", "Male", 1515236127);
        teacher3.displayInformation();
    }
    
}
