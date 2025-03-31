package academy.italo.maratonajava.javacore.Minterfaces.test;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Corolla();
        Carro meuCarro2 = new Fusca();

        meuCarro.acelerar();
        meuCarro2.acelerar();
    }
}
