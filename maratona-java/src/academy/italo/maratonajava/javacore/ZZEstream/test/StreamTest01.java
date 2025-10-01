package academy.italo.maratonajava.javacore.ZZEstream.test;

import academy.italo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Ordenar por titulo
//Os 3 primeiros com preço menor que 4;
public class StreamTest01 {
    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Naruto", 10.99)
    ));

    public static void main(String[] args) {
        StreamTest01.lightNovelList.sort(Comparator.comparing(LightNovel::getName));
        System.out.println(lightNovelList);

        List<LightNovel> titles = new ArrayList<>();
        for(LightNovel content: lightNovelList){
            if(content.getPrice() > 4){
                titles.add(content);
            }
            if(titles.size() >= 3){
                break;
            }
        }

        System.out.println(titles);
    }
}
