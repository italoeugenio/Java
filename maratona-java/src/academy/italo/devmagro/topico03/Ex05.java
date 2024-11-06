package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float baseSalario = 1293.20f;

        System.out.print("Digite seu salário: ");
        float meuSalario = scanner.nextFloat();

        float quantiadeDeSalarios = meuSalario/baseSalario;

        System.out.printf("Quantidade de salários mínimos que você ganha: %d", (int) quantiadeDeSalarios);
        System.out.println();
        System.out.printf("Resto: %.2f", meuSalario % baseSalario);

    }
}
