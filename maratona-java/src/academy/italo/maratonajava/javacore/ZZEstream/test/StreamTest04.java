package academy.italo.maratonajava.javacore.ZZEstream.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> liberdade = List.of("Kaylane", "Gaby", "Allany", "Lunna", "Caua", "Italo");
        List<String> todoBoi = List.of("Sarah", "Maria", "Akio", "Camilla");
        devdojo.add(liberdade);
        devdojo.add(todoBoi);

        List<String> pessoas = new ArrayList<>();

        for(int i = 0; i < devdojo.size();i++){
            for(int j = 0; j < devdojo.get(i).size(); j++){
                System.out.println((devdojo.get(i).get(j)));
            }
        }

        devdojo.stream()
                .flatMap(Collection::stream);

        System.out.println(devdojo);
    }
}
