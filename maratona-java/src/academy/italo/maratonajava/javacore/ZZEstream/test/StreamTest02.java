package academy.italo.maratonajava.javacore.ZZEstream.test;

import academy.italo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Naruto", 10.99)
    ));
    public static void main(String[] args) {
     List<String> listaFiltrada =  lightNovelList.stream()
                .sorted(Comparator.comparing((LightNovel::toString)))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(ln -> ln.getName())
                .collect(Collectors.toList());

        System.out.println(listaFiltrada);
    }
}
