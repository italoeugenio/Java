package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit : ");
        float fahrenheit = scanner.nextFloat();

        float celsius = (5 * (fahrenheit - 32)/9);

        System.out.printf("A temperatura em Celsius é de %.2f °C" , celsius);
    }
}
