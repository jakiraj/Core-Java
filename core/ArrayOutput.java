package core;

public class ArrayOutput {

    public static void main(String[] args) {
        int[][] number = new int [4][5];
        int k = 0;
        //assigninng the value to the 2D array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                number[i][j] = k;
                k++;
            }
        }
        
        //printing the elements
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + number[i][j]);
            }
            System.out.println();
        }
    }
    
}
