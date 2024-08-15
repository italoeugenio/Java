package academy.italo.soffner.cap3;

import java.util.Scanner;
import java.util.Arrays;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("-----Digite 5 números inteiros para adicionar ao array-----");
        for(int x = 0; x < numeros.length; x++){
            System.out.print("Digite o número que você quer adionar:");
            numeros[x] = scanner.nextInt();
            System.out.println("Voce adicionou o número:" + numeros[x]);
        }

        System.out.println("Números inseridos:");
        for (int num: numeros){
            System.out.println(" "+num);
        }

        Arrays.sort(numeros);
        System.out.println("Maior e menor número do array");
        System.out.println(numeros[0]);
        System.out.println(numeros[numeros.length - 1]);
    }
}
