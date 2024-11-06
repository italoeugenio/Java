package academy.italo.devmagro.topico03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayDeNumeros = new ArrayList<>();
        int number;
        int count = 1;

        while(count <= 3){
            number = scanner.nextInt();
            arrayDeNumeros.add(number);
            count++;
        }

        // Ordena a lista em ordem decrescente
        Collections.sort(arrayDeNumeros, Collections.reverseOrder());

        // Imprime os números em ordem decrescente
        for(int i = 0; i < arrayDeNumeros.size(); i++) {
            System.out.println(arrayDeNumeros.get(i));
        }

        System.out.println("FORMA CORRETA DE FAZER COM O ARRAY, POIS TEM TAMANHO FIXO 3");

        int[] arrayDenumeros2 = new int[3];

        for(int i = 0; i < 3; i++){
            arrayDenumeros2[i] = scanner.nextInt();
        }
        Arrays.sort(arrayDenumeros2);

        for(int i = arrayDenumeros2.length-1; i >= 0; i--){
            System.out.print(arrayDenumeros2[i] + " ");
        }
    }
}
