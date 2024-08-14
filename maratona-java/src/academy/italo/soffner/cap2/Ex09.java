package academy.italo.soffner.cap2;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em metro para converter em milímetros:");
        int valorEmMetros = scanner.nextInt();

        System.out.printf("O valor convertido de %d(M) para mm foi: %d(mm)", valorEmMetros, valorEmMetros * 1000);
    }
}
