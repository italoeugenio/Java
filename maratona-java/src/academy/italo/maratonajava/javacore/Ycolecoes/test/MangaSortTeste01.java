package academy.italo.maratonajava.javacore.Ycolecoes.test;

import academy.italo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortMangaByIDComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Attack on titan", 15.9));
        mangas.add(new Manga(1L,"Berserk", 100));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 30));
        mangas.add(new Manga(3L,"Pokemon", 45));
        mangas.add(new Manga(2L, "Dragon Ball Z", 41));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
        System.out.println();

        Collections.sort(mangas);
        System.out.println("--Sorted--");
        for(Manga manga: mangas){
            System.out.println(manga);
        }
        System.out.println();

        Collections.sort(mangas, new SortMangaByIDComparator());
        System.out.println("--Sorted by ID--");
        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
