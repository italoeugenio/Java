package academy.italo.soffner.cap1;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para saber sua tabuada:");
        int numero = scanner.nextInt();

        System.out.println("\nTABUADA DO " +  numero);
        for(int x = 0; x <= 10; x++){
            System.out.printf("%d * %d = %d%n", x, numero, (x*numero));
        }
    }
}
