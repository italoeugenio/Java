package academy.italo.soffner.cap5;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra com letras minúsculas: ");
        String palavra  = scanner.nextLine();
        System.out.println();
        palavra = palavra.toUpperCase();

        int numeroDeCaracteres = palavra.length();
        System.out.println("Número de caracteres: " + numeroDeCaracteres);

        char[] vetor = palavra.toCharArray();

        for(int i = 0 ; i < palavra.length(); i++){
            System.out.print(vetor[i]);
        }
    }
}
