package file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteFileDemo {

    public static void main(String[] args) {
        String id, name;
        try {
            Formatter formatter = new Formatter("C:/Users/ZI Zohir/Desktop/person/student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How may students: ");
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter Student ID and Name: ");
                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id, name);
            }
            formatter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

}
