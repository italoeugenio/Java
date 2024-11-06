package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorQualquer = 100;

        System.out.print("Reajuste de 5% = " + (valorQualquer + (valorQualquer * 0.05)));
    }
}
