package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual era sua velocidade média?: ");
        int velocidade = scanner.nextInt();

        System.out.print("Digite quantas horas você gastou: ");
        float tempoEmHoras = scanner.nextFloat();

        System.out.print("Digite quantos minutos você gastou: ");
        float tempoEmMinutos = scanner.nextFloat();

        float tempoTotal = tempoEmHoras + (tempoEmMinutos / 60);
        float distancia = tempoTotal * velocidade;


        System.out.println();
        System.out.println("Distância: " + distancia);
        System.out.printf("Litros usados: %.2f", (distancia/12));
    }
}
