package core;

public class Array2D {

    public static void main(String[] args) {
        int[][] number = new int[2][3];
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + number[row][col]);
            }
            System.out.println();
        }
    }

}
