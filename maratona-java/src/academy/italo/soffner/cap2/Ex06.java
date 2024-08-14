package academy.italo.soffner.cap2;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em real:");
        float valorEmReais = scanner.nextFloat();

        System.out.printf("O valor R$%.2f para Dolar fica : USD %.2f", valorEmReais, valorEmReais/5.48);
    }
}
