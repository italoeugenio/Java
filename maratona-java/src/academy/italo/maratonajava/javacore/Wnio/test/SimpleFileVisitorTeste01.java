package academy.italo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().contains(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}



public class SimpleFileVisitorTeste01 {
    public static void main(String[] args) throws IOException {
//        Path root = Paths.get(".");
//        Files.walkFileTree(root, new ListAllFiles());

        Integer num = 12;
        String num2  = num.toString();

        System.out.println(num2.getClass());
    }
}
