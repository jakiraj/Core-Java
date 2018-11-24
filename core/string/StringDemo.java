package core.string;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "Jakir Hossain";
        String s2 = new String ("Jakir Hossain");
        
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        
        int len = s1.length();
        System.out.println("Length of s1 = " + len);
        
        //== check data type and value
        if (s1 == s2) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        //equals method check only value
        if (s1.equals(s2)) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        //contains method check only value
        if (s1.contains(s2)) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        //contains method check value
        if (s1.contains("Jakir")) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        //equalsIgnoreCase method ignore uppercase and lowercase
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        //check value 
        boolean con = s1.contains("Jaki");
        System.out.println(con);
        
        //check empty
        boolean b = s1.isEmpty();
        System.out.println("b = " + b);
    }
    
}
