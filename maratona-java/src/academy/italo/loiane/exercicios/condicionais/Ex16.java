package academy.italo.loiane.exercicios.condicionais;

import java.util.Scanner;

//https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2014%2015.pdf

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de A:");
        double A = scanner.nextDouble();
        if(A == 0){
            System.out.println("Não é uma equação do segundo grau, pois o A é 0");
            return;
        }

        System.out.print("Valor de B:");
        double B = scanner.nextDouble();
        System.out.print("Valor de C:");
        double C = scanner.nextDouble();

        double delta;
        delta = B*B - (4 * A * C);

        double X1;
        X1 = (-B + Math.sqrt(delta)) / (2 * A);
        double X2;
        X2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (delta < 0){
            System.out.println("A não possui raizes reais, pois o Delta deu negativo");
            return;
        } else if (delta == 0){
            System.out.println("\nSó tem 1 raiz");
            System.out.println("X1: " + X1);
            System.out.println("X2: " + X2);
            return;
        }else if(delta > 0) {
            System.out.println("\nTem duas raizes");
            System.out.println("X1 positivo: " + X1);
            System.out.println("X2 negativo: " + X2);
            return;
        }
    }
}
