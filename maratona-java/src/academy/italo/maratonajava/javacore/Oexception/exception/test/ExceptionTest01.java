package academy.italo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    private static void criarNovoArquivo() {

    }

    public static void main(String[] args) {
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
