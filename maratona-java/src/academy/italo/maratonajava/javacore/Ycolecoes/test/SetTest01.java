package academy.italo.maratonajava.javacore.Ycolecoes.test;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Italo");
        names.add("Sarah");
        names.add("Camilla");
        names.add("Karol Aguiar");
        names.add("Kaylane");
        names.add("Kaylane");

        for(String name: names){
            System.out.println(name);
        }
    }
}
