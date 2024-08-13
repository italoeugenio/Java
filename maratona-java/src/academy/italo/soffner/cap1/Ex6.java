package academy.italo.soffner.cap1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Prova 1 (PESO 2): ");
        float notaProva1 = scanner.nextFloat();

        System.out.print("Prova 2 (PESO 3): ");
        float notaProva2 = scanner.nextFloat();

        System.out.print("Prova 3 (PESO 5): ");
        float notaProva3 = scanner.nextFloat();

        float media;
        media = ((notaProva1*2) + (notaProva2*3) + (notaProva3*5)) / 10;

        System.out.println("\nNome do aluno " + nome);
        System.out.println("Sua média foi " + media);
    }
}
