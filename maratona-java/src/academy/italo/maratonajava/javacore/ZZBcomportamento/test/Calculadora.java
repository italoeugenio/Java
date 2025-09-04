package academy.italo.maratonajava.javacore.ZZBcomportamento.test;

import academy.italo.maratonajava.javacore.ZZBcomportamento.interfaces.Operacao;

public class Calculadora {
    public static void main(String[] args) {
        Operacao soma = (a,b) -> a + b;
        Operacao multiplicar = (a,b) -> a * b;
        System.out.println(soma.calcular(2,3));
        System.out.println(multiplicar.calcular(2,3));
    }
}
