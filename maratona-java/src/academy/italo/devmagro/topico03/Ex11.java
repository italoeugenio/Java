package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        float[] notaDeBimestre = new float[4];
        float somaDasNotas = 0;
        for(int i = 0; i < notaDeBimestre.length; i++){
            System.out.print("Digite a nota do " +(i+1) + " Bimestre:");
            notaDeBimestre[i] = scanner.nextFloat();
            somaDasNotas += notaDeBimestre[i];
        }

        float media = somaDasNotas/notaDeBimestre.length;


        System.out.println();
        System.out.printf("MÉDIA DO %s: ", nome);
        System.out.println(media);
        if(media >= 7){
            System.out.println("Student APROVADO");
        } else {
            System.out.println("Student REPROVADO");
        }

    }
}
