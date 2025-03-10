package academy.italo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta123");
        if (Files.notExists(pastaPath)) {
            Path pastaDiretorio = Files.createDirectory(pastaPath);
        }

        Path subpasta = Paths.get("teste/italo/trabalho");
        Path subpastaPath = Files.createDirectories(subpasta); // Não lanca exceptions


        Path filePath = Paths.get(subpasta.toString() , "file.txt");
        if(Files.notExists(filePath)){
            Files.createFile(filePath);
        }

        Path source = filePath;
//        Path target = Paths.get(filePath.toString(), "fileRenamed.txt");
        Path target = Paths.get(filePath.getParent().toString(), "fileRenamed.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
