package academy.italo.maratonajava.javacore.Minterfaces.test;

import academy.italo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.italo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.italo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        databaseLoader.retriveMaxDataSize();
    }
}
