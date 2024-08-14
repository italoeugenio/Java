package academy.italo.soffner.cap3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário:");
        float salario = scanner.nextFloat();

        if (salario > 1000){
            System.out.printf("Seu salário de %.2f vai receber um aumento de 10%% então o valor final vai ser: R$%.2f", salario, (salario * 0.10)+salario);
        } else{
            System.out.printf("Seu salário é R$%.2f", salario);
        }
    }
}
