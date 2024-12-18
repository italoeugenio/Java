package academy.italo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é lindo, é o melhor curso do brasil\nContinuando na próxima linha");
            bw.flush(); //Limpa tudo que tem dentro do buffer
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

