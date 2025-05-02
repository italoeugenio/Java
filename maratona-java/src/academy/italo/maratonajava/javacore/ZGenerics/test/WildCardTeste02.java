package academy.italo.maratonajava.javacore.ZGenerics.test;

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


    //Type erasure
    private static void printConsulta(List<? extends Animal>  animals){
        for(Animal animal : animals){
            animal.consulta();
        }
    }

    private static void printConsultarAnimal(List<? super Cachorro > animals){
        for(Object animal: animals){
            if(animal instanceof Cachorro){
                System.out.println(animal);
            }
        }
    }

}
