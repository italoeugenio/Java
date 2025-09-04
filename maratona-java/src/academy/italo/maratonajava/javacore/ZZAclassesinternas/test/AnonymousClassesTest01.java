package academy.italo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal{
    public void walk(){
        System.out.println("Animal walking");
    }
}

//São classes que vão ser exister por um certo período de tempo
// e não pode ser utlizadas novamente
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in shadows");
            }
        };
        animal.walk();
    }
}
