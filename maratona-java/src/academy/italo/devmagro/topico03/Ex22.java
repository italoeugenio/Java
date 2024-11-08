package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Quociente: " + num1 / num2);
        System.out.println("Resto: " + num1 % num2);
    }
}
