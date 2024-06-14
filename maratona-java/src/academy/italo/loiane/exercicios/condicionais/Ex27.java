package academy.italo.loiane.exercicios.condicionais;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("         Até 5 Kg     Acima de 5Kg");
        System.out.println("MORANGO R$2,50 por kg  R$2,20 por kg");
        System.out.println("MAÇA    R$1,80 por kg  R$1,50 por kg");

        System.out.print("\nDigite a quantidade de morangos em Kg: ");
        float morangosKg = scanner.nextFloat();
        System.out.print("Digite a quantidade de maças em Kg: ");
        float macaKg = scanner.nextFloat();

        float valorDoMorango = 0.0F;
        float valorDaMaca = 0.0F;

        if (morangosKg <= 5){
            valorDoMorango = morangosKg * 2.50F;
        } else {
            valorDoMorango = morangosKg * 2.20F;
        }

        if (macaKg <= 5){
            valorDaMaca = macaKg * 1.80F;
        } else {
            valorDaMaca = macaKg * 1.50F;
        }

        float valorTotal = valorDoMorango + valorDaMaca;
        float somaDosKg = morangosKg + macaKg;

        if(valorTotal > 25 || somaDosKg > 8){
            valorTotal = valorTotal - (valorTotal * 0.1F);
        }

        System.out.println("Valor total a ser pago: R$ " + valorTotal);
    }
}
