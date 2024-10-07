package academy.italo.maratonajava.javacore.Npolimorfismo.test;

import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.italo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Tomate Italiano", 10);
        tomate.setDataValidade("15/10/2024");

        CalculadoraImposto.calculadorImposto(tomate);
        System.out.println("------------");
        CalculadoraImposto.calculadorImposto(produto);
    }
}
