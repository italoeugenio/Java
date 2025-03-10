package academy.italo.maratonajava.javacore.Wnio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/Users/italo/Documents/Java/maratona-java/file.txt");

        File file = p1.toFile();
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
