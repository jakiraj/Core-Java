package core.string;

public class StringDemo4 {

    public static void main(String[] args) {
        String s1 = "This is our country";
        System.out.println(s1);
        
        //replace
        String s2 = s1.replace('i', 'e');
        System.out.println(s2);
        
        //splite 
        String[] s3 = s1.split(" ");
        for(String x : s3){
            System.out.println(x);
        }
    }
    
}
