package academy.italo.soffner.cap1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        float raio = scanner.nextFloat();

        float circunferencia = 3.14F * (raio*2);

        System.out.printf("O comprimento da circunferêcia é: %.2f%n", circunferencia );
    }
}
