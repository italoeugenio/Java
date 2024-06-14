package academy.italo.maratonajava.javacore.Bintroducaometodos.test;

import academy.italo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(calculadora.divideDoisNumeros(20,0));
        System.out.println("----------------------");
        calculadora.divideDoisNumerosVersaoNova(10,2);
        calculadora.divideDoisNumerosVersaoNova(10,0);
    }
}
