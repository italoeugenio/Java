package academy.italo.soffner.cap2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu time de Rainbow Six:");
        System.out.println("1 - FaZe Clan");
        System.out.println("2 - Ninjas in Pyjamas");
        System.out.println("3 - Team Liquid");
        System.out.println("4 - MIBR");
        System.out.println("5 - INTZ");

        System.out.print("Digite o número correspondente ao seu time: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu o FaZe Clan.");
                break;
            case 2:
                System.out.println("Você escolheu o Ninjas in Pyjamas.");
                break;
            case 3:
                System.out.println("Você escolheu o Team Liquid.");
                break;
            case 4:
                System.out.println("Você escolheu o MIBR.");
                break;
            case 5:
                System.out.println("Você escolheu o INTZ.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 5.");
        }
    }
}
