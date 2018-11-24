package core;

public class MathDemo {

    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        
        int max = Math.max(x, y);
        System.out.println("Maximum= " + max);
        
        int min = Math.min(x, y);
        System.out.println("Minimum= " + min);
        
        int absolute = Math.abs(y);
        System.out.println("Absolute of y= " + absolute);
        
        double power = Math.pow(x, y);
        System.out.println("x to the power y= " + power);
    }
    
}
