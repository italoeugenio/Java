package academy.italo.soffner.cap4.ex07;

import java.util.Scanner;

public class Forma2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número com 3 algarismos: ");
        int numero = scanner.nextInt();

        while(numero > 0){
            System.out.printf("%d", numero%10);
            numero /= 10;
        }
    }
}
