package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano que você nasceu: ");
        int ano = scanner.nextInt(); // 2023

        while(ano > 2024){
            System.out.print("Por favor, digite igual ou menor que 2024: ");
            ano = scanner.nextInt();
        }

        int anoAtual = (2024 - ano) + 1;

        int meses = (365 * anoAtual)/12;
        int dias = 30 * anoAtual;

        System.out.println();
        System.out.println("Anos: " + anoAtual);
        System.out.println("Meses: " + meses );
        System.out.println("Dias: " + dias);
    }
}
