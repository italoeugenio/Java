package academy.italo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("src/academy/italo/maratonajava/javacore/Vio/test/file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("Path " + file.getPath());
            System.out.println("AbsolutePath " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified: " + new Date(file.lastModified()));
            if(file.exists()){
                boolean isDeleted = file.delete();
                System.out.println("Deleted: " + isDeleted);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
