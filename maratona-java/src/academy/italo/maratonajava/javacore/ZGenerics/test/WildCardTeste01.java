package academy.italo.maratonajava.javacore.ZGenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando dog");
    }
}

class Cat extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando cat");
    }
}


public class WildCardTeste01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsulta(cats);
        printConsulta(cachorros);
    }

    private static void printConsulta(Animal[] animals){
        for(Animal animal : animals){
            animal.consulta();
        }
    }
}
