package academy.italo.loiane.exercicios.condicionais;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nDigite um número para saber se é par ou ímpar ou digite 'sair' para sair:");
            String input = scanner.nextLine();

            if ("sair".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int numero = Integer.parseInt(input);
                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é par.");
                } else {
                    System.out.println("O número " + numero + " é ímpar.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número ou 'sair'.");
            }
        }
    }
}
