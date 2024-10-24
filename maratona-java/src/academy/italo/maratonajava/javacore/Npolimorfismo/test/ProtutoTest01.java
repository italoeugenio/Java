package academy.italo.maratonajava.javacore.Npolimorfismo.test;

import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.italo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProtutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador", 11000.00);
        Tomate tomate = new Tomate("Tomate", 10);

        CalculadoraImposto.calculaImpostoComputador(computador);
        CalculadoraImposto.calculaImpostoTomate(tomate);

    }
}
