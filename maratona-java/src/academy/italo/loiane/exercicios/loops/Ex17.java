package academy.italo.loiane.exercicios.loops;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número fatorial:");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("1");
        } else if (numero < 0) {
            System.out.println("Não existe fatorial de negativo");
        } else {
            int resultado = 1;
            for (int fatorial = 1; fatorial <= numero; fatorial++) {
                resultado *= fatorial;
            }
            System.out.println(resultado);
        }
    }
}