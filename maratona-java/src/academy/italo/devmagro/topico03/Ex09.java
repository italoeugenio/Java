package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura:");
        float altura = scanner.nextFloat();

        System.out.println("Digite o seu peso: ");
        float peso = scanner.nextFloat();

        float valorDoIMC = peso / (altura * altura);

        System.out.println("---O SEU IMC---");
        if (valorDoIMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (valorDoIMC >= 18.5 && valorDoIMC <= 24.9) {
            System.out.println("Peso ideal, parabéns!");
        } else if (valorDoIMC >= 25.0 && valorDoIMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (valorDoIMC >= 30.0 && valorDoIMC <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (valorDoIMC >= 35.0 && valorDoIMC <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else if (valorDoIMC >= 40.0) {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
