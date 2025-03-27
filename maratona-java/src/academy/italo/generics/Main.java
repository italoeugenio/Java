package academy.italo.generics;

public class Main {
    public static void main(String[] args) {
        Mochila<Object> mochila = new Mochila<>();
        mochila.adicionarFerramenta(new Shuriken(12));
        mochila.adicionarFerramenta(new Pergaminho("Proibido"));
        mochila.adicionarFerramenta(new Pergaminho("Sorte"));

        mochila.mostarFerramentas();
    }
}
