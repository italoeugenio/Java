package academy.italo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    public static final int MAX_DATA_SIZE = 10;

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }
}
