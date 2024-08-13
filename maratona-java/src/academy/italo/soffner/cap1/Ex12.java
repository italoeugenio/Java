package academy.italo.soffner.cap1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero para saber se está entre o intervalo de 100 e 200: ");
        int numero = scanner.nextInt();

        if (numero > 100 && numero < 200){
            System.out.println("Está dentro do intervalo");
        } else {
            System.out.println("Não está dentro");
        }
        scanner.close();
    }
}
