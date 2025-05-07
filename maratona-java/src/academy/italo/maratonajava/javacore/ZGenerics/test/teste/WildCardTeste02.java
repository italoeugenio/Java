package academy.italo.maratonajava.javacore.ZGenerics.test.teste;

import java.util.ArrayList;
import java.util.List;

public class WildCardTeste02 {
    public static void main(String[] args) {
        List<Cachorro> cachorroList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        printConsulta(cachorroList);
        printConsulta(catList);

        List<Animal> animalsList = new ArrayList<>();
        printConsultarAnimal(animalsList);
        printConsultarAnimal(cachorroList);
    }

    // Este método aceita listas de Animal ou subclasses (Cachorro, Cat, etc)
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    // Este método aceita listas de Cachorro ou superclasses (Animal, Object)
    private static void printConsultarAnimal(List<? super Cachorro> animals) {
        for (Object animal : animals) {
            if (animal instanceof Cachorro) {
                System.out.println(animal);
            }
        }
    }

    
    private static void printConsultaAnimal(List<? super Animal> animals) {
        for (Object o : animals) {
            if (o instanceof Animal) {
                System.out.println(o);
            }
        }
    }

}