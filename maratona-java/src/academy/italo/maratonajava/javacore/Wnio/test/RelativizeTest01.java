package academy.italo.maratonajava.javacore.Wnio.test;

import java.nio.file.Paths;
import java.nio.file.Path;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/italo");
        Path clazz = Paths.get("/home/italo/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);

        System.out.println(pathToClazz);
    }
}
