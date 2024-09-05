package academy.italo.soffner.cap4;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] listaNumeros = new int[3];

        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Digite um número para adicionar ao array: ");
            listaNumeros[i] = scanner.nextInt();
        }

        System.out.println("Números adicionados ao array (em ordem inversa):");
        for (int i = listaNumeros.length - 1; i >= 0; i--) {
            System.out.println(listaNumeros[i]);
        }
    }
}
