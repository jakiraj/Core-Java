package core.string;

public class StringDemo2 {

    public static void main(String[] args) {
        String firstName = "Jakir";
        String lastName = " Hossain";
        
        String fullName = firstName + lastName;
        System.out.println("Full Name is " + fullName);
        
        //concat method
        fullName = firstName.concat(lastName);
        System.out.println("Full Name is " + fullName);
        
        //upperCase
        String upperName = fullName.toUpperCase();
        System.out.println("upperName = " + upperName);
        
        //lowerCase
        String lowerCase = fullName.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);
        
        //startsWith method
        boolean b = firstName.startsWith("J");
        System.out.println("b = " + b);
        
        //endWith method
        boolean last = firstName.endsWith("n");
        System.out.println("last = " + last);
        
        //array
        String[] names = {"Jakir", "Hossain", "Raj"};
        for(String x : names){
            System.out.println(x);
        }
    }
    
}
