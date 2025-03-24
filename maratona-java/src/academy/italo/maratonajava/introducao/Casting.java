package academy.italo.maratonajava.introducao;

class Animal {
}
class Dog extends Animal {
}

public class Casting {
    public static void main(String[] args) {
        //Implict
        System.out.println("Implict");
        int num1 = 10;
        double value1 = num1;
        System.out.println(value1 + "\n");

        //Explicit
        System.out.println("Explicit");
        double num2 = 10.5;
        int value2 = (int) num2;
        System.out.println(value2 + "\n");

        //Casting Objects
        System.out.println("Casting animal");
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
        System.out.println(dog);

        Animal animal1 = new Animal();
//        Dog dog1 = (Dog) animal1; // This will throw ClassCastException
//        System.out.println(dog1);

        //Exercise
        double price1 = 15.49;
        double price2 = 18.10;
        double price3 = 5.12;

        int total = (int) (price1 + price2 + price3);
        int total2 = total;
        double totalNormal =  (price1 + price2 + price3);

        System.out.println(total);
        System.out.println(total2);
        System.out.println(totalNormal);
    }
}
