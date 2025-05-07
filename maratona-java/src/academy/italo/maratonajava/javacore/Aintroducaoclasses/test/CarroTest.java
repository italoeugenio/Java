package academy.italo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.italo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Ford Mustang";
        carro1.modelo = "GT";
        carro1.ano = 2021;

        carro2.nome = "Toyota Corolla";
        carro2.modelo = "Altis";
        carro2.ano = 2020;

//        carro2 = carro1;

        System.out.println("Car 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println();
        System.out.println("Car 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
