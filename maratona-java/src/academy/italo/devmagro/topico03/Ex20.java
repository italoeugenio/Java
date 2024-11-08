package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para saber sua tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabudada do " + numero);
        for (int i = 0; i <= numero; i++) {
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);
        }
    }
}
