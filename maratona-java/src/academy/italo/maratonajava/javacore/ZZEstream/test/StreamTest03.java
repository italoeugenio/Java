package academy.italo.maratonajava.javacore.ZZEstream.test;

import academy.italo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest03 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Naruto", 10.99)
    ));

    public static void main(String[] args) {
       List<LightNovel >teste = lightNovelList.stream()
               .filter(ln -> ln.getName().toLowerCase().startsWith("n"))
               .toList();

        System.out.println(teste);
    }
}
