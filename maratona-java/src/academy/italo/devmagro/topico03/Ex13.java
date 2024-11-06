package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sua idade: ");
        int idade = scanner.nextInt();


        System.out.println("--------------------------");
        System.out.println("Olá, " + nome);
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else if (idade < 18 && idade > 0) {
            System.out.println("Você é de menor");
        } else {
            System.out.println("Você não é humano");
        }
        System.out.println("--------------------------");
    }
}
