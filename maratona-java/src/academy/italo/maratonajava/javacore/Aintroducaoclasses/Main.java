package academy.italo.maratonajava.javacore.Aintroducaoclasses;

import academy.italo.maratonajava.javacore.Aintroducaoclasses.howtousesuper.Animal;
import academy.italo.maratonajava.javacore.Aintroducaoclasses.howtousesuper.Cat;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("nemo", 12);
        Animal cat1 = new Animal("ana", 23);
        System.out.println(cat1.getAge());

        System.out.println(cat.getName());
//        cat.makeNoise();
    }
}
