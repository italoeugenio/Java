package academy.italo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    //FileWriter
    //FileReader
    //BufferedWriter
    //BufferedReader
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);) {
            fw.write("O DevDojo é lindo, é o melhor curso do brasil\nContinuando na próxima linha");
            fw.flush(); //Limpa tudo que tem dentro do buffer
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
