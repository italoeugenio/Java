package academy.italo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static <br> void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)
        Buffered br = new BufferedReader(fr){
            br.readLin

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
