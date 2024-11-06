package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("---Trocando valores---");
        int guardarValor = A;
        A = B;
        B = guardarValor;

        System.out.println("O valor de A agora é: " + A);
        System.out.println("O valor de B agora é: " + B);
    }
}
