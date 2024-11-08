package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita o Lado A: ");
        float A = scanner.nextFloat();

        System.out.print("Digita o Lado B: ");
        float B = scanner.nextFloat();

        System.out.print("Digita o Lado C: ");
        float C = scanner.nextFloat();

        System.out.println();
        System.out.println("----TIPO DE TRIÂNGULO----");
        if (A == B && B == C) {
            System.out.println("É equilatero");
        } else if (A != B && B != C) {
            System.out.println("É Escaleno");
        } else {
            System.out.println("Triângulo Isósceles");
        }
    }
}

