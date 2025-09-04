package academy.italo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.italo.maratonajava.javacore.ZGenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Boat> boatlist = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));
        Collections.sort(boatlist, new Comparator<Boat>() {
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Boat boat : boatlist) {
            System.out.println(boat.getName());
        }
    }
}