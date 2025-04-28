package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();

        names.add("Italo");
        names.add("Sarah");
        names.add("Camilla");
        names.add("Karol Aguiar");
        names.add("Kaylane");
        names.add("Kaylane");

        System.out.println(names);
    }
}