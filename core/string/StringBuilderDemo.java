package core.string;

public class StringBuilderDemo {
    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Jakir");
        System.out.println("str = " + str);
        
        str.append(" Hossain");
        str.append(25);
        
        System.out.println("str = " + str);
        
        str.reverse();
        System.out.println(str);
        
        str.delete(2, 5);
        System.out.println(str);
    }
    
}
