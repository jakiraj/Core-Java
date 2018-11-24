package file;

import java.io.File;

public class FileDirectoryDemo {

    public static void main(String[] args) {
        File dir = new File("C:/Users/ZI Zohir/Desktop/person");
        dir.mkdir(); //directory will be created
//        show the directory location path
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        //show the directory name
        System.out.println(dir.getName());
        //get a message when delete directory
        if (dir.delete()) {
            System.out.println(dir.getName()+" folder has been deleted");
            
        }
    }
    
}
