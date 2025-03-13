package academy.italo.maratonajava.javacore.Minterfaces.dominio;

public interface Gato {
    static void miar1(){
        System.out.println("miau static");
    }


     default void miarDefault(){
        System.out.println("miau default");
    }

     void miarVoid();
}
