package academy.italo.maratonajava.javacore.Bintroducaometodos.test;

import academy.italo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros1 = {1,2,3,4,5};
        calculadora.somaArray(numeros1);
        calculadora.somaVarArgs(1,2,4,5,7,82,7,2,6,2);
    }
}
