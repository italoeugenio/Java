package academy.italo.soffner.cap5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        float[] nota = new float[3];

        for(int i = 0; i < nota.length;i++){
            System.out.print("Digite sua nota:");
            nota[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("---RELATÓRIO---");
        System.out.printf("Seu nome é: %s", nome);
        System.out.println();
        System.out.println("NOTAS");
        for(float notas:nota){
            System.out.println(notas);
        }

    }
}
