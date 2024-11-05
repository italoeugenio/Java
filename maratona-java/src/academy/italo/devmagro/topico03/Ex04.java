package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        System.out.println("O seu antecessor é: " + (numero - 1));
        System.out.println("O seu sucessor é: "+ (numero + 1));
    }
}
