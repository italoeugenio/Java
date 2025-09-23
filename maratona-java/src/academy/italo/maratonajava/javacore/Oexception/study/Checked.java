package academy.italo.maratonajava.javacore.Oexception.study;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    public static void main(String[] args) throws FileNotFoundException{
        readFile1("myFile.txt");
        readFile2("myFile.txt");
    }

    private static void readFile1(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("That file does not exist");
        }
    }

    private static void readFile2(String fileName) throws FileNotFoundException{
        FileReader reader = new FileReader(fileName);
    }
}
