package academy.italo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;

public class FileReaderTest01 {
    public static void main(String[] args) {
        //Quando voce faz a leitura e a escrita de um arquivo é necessário liberar os recursos por meio meio do close.
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
//            char[] in = new char[30];
            //O READ RETORNA -1
//            fr.read(in);
//            for(char c:in){
//                System.out.print(c);
//            }
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
