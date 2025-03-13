package academy.italo.maratonajava.javacore.Minterfaces.test;

import academy.italo.maratonajava.javacore.Minterfaces.dominio.Cachorro;

public class Animal implements Cachorro {
    @Override
    public void teste() {

    }

    @Override
    public void miarDefault() {
        Cachorro.super.miarDefault();
    }

    @Override
    public void miarVoid() {

    }

    public static void main(String[] args) {
        Animal main = new Animal();

       main.miarDefault();
    }
}
