package academy.italo.maratonajava.javacore.Npolimorfismo.servico;

import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.italo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculadorImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
//            ((Tomate) produto).getDataValidade(); outro exemplo da linha abaixo
            System.out.println("Data de validade: "+ tomate.getDataValidade());
        }
    }
}
