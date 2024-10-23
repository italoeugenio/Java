package academy.italo.soffner.cap5;

import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        float[] vetor = new float[3];
        float soma = 0;

        for(int i = 0; i < vetor.length;i++){
            System.out.print("Digite sua nota: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("---NOTAS---");
        for(float nota:vetor){
            System.out.println(nota);
            soma += nota;
        }

        System.out.println();
        System.out.println("MEDIA");
        System.out.printf("%.2f", soma/vetor.length);
    }
}
