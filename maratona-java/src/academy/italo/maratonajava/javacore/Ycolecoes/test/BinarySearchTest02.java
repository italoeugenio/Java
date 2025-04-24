package academy.italo.maratonajava.javacore.Ycolecoes.test;

import academy.italo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on titan", 15.9));
        mangas.add(new Manga(1L,"Berserk", 100));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 30));
        mangas.add(new Manga(3L,"Pokemon", 45));
        mangas.add(new Manga(2L, "Dragon Ball Z", 41));

        Collections.sort(mangas);
        for(Manga manga: mangas){
            System.out.println(manga);
        }
        Manga mangaToSearch = new Manga(5L,"Attack on titan", 15.9);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
