package academy.italo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTeste01 {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DoesFileAttributes, PosixFileAttributes
        // Serve para trabalhar com difernetes SO
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

    }
}
