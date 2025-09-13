package academy.italo.maratonajava.javacore.ZZClambda.test;

import academy.italo.maratonajava.javacore.ZZClambda.dominio.Animal;

public class AnonimousClass {
    public static void main(String[] args) {
        Animal dog = new Animal("Jake", 8){
            @Override
            public void AnimalNoise(){
                System.out.println("I am a dog and i beerk");
            }
        };

        dog.AnimalNoise();
    }
}
