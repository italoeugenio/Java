package academy.italo.maratonajava.javacore.Npolimorfismo.test;

import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.italo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Macbook M1" , 11000);
        Tomate tomate = new Tomate("Tomate italiano", 10);
        Televisao tv = new Televisao("Samsung 50\" ",5000);

        CalculadoraImposto.calculadorImposto(computador);
        System.out.println("---------------------------------");
        CalculadoraImposto.calculadorImposto(tomate);
        System.out.println("---------------------------------");
        CalculadoraImposto.calculadorImposto(tv);

    }
}
