package academy.italo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo/Teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args)throws IOException {
        criarNovoArquivo();
    }
}