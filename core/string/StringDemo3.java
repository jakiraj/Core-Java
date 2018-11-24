package core.string;

public class StringDemo3 {

    public static void main(String[] args) {
        String country = "Bangladesh is our country";
        System.out.println(country);
        
        //remove first & last space
        String s3 = country.trim();
        System.out.println(s3);
        
        //find character given index
        char ch = country.charAt(0);
        System.out.println("ch = " + ch);
        
        //show codePoint given index
        int value = country.codePointAt(0);
        System.out.println("value = " + value);
        
        //show index of first position
        int position = country.indexOf('n');
        System.out.println("first position of n = " + position);
        
        //show index of last position
        position = country.lastIndexOf('n');
        System.out.println("last position of n = " + position);
    }
    
}
