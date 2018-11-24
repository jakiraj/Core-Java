package file;

import java.io.File;

public class CreateFileDemo {

    public static void main(String[] args) {
        File dir = new File("C:/Users/ZI Zohir/Desktop/person/");
        dir.mkdir(); //directory will be created
        //get path directory
        String path = dir.getAbsolutePath();
        File file1 = new File (path + "/student.txt");
        File file2 = new File (path + "/teacher.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        file2.delete();
        if(file2.exists()){
            System.out.println("File exist");
        }else{
            System.out.println("File does not exist");
        }
    }
    
}
