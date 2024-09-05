package academy.italo.soffner.cap4;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float media;
        float soma = 0;
        int cont = 0;

        while (true) {
            System.out.print("Digite varios números para saber a média deles (0 para sair):");
            float numeros = scanner.nextFloat();

            soma += numeros;
            cont++;

            media = soma / cont;

            if (numeros == 0) {
                break;
            }
        }
        System.out.println("A média dos números é: " + media);

    }
}
