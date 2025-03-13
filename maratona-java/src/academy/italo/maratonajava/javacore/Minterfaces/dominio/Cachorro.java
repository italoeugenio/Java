package academy.italo.maratonajava.javacore.Minterfaces.dominio;

public interface Cachorro extends Gato {
    void teste();

    static void latir(){
        System.out.println("Latir");
    }

}
