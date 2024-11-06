package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] notas = new float[3];
        float somaDasNotas = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.print((i+1) + ". Digite sua nota: ");
            notas[i] = scanner.nextFloat();

            while(notas[i] > 10 || notas[i] < 0){
                System.out.print("Por favor, DIGITE UM VALOR DE (0-10): ");
                notas[i] = scanner.nextFloat();
            }

            somaDasNotas += notas[i];
        }

        System.out.println("A sua média foi: " + somaDasNotas/notas.length);
    }
}
