package academy.italo.maratonajava.javacore.ZZClambda.test;

import academy.italo.maratonajava.javacore.ZZClambda.dominio.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("SAO", 5),
                new Anime("Berserk", 10),
                new Anime("One piece", 900)));

        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(animeList);
    }
}
