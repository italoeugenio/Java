package academy.italo.maratonajava.generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mochila<Object> mochila = new Mochila<>();
        mochila.adicionarFerramenta(new Shuriken(12));
        mochila.adicionarFerramenta(new Pergaminho("Proibido"));
        mochila.adicionarFerramenta(new Pergaminho("Sorte"));

        System.out.println(mochila.getFerramentas());

        Printer printer1 = new Printer(15);
        printer1.printerSomething();

        Printer printer2 = new Printer("String");
        printer2.printerSomething();

        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(15);
        inteiros.add(14);
        inteiros.add(13);
        System.out.println(inteiros.toString() + "Usando to string");
    }
}
