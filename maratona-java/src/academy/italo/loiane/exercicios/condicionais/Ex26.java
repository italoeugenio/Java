package academy.italo.loiane.exercicios.condicionais;

import java.util.Scanner;

public class Ex26 {
    //    https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2014%2015.pdf
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua opção:");
        System.out.println("(1) Álcool [3,96 POR Litro]");
        System.out.println("(2) Gasolina [5,97 POR Litro]");
        int opcao = scanner.nextInt();

        final float alcoolPreco = 3.96F;
        final float gasolinaPreco = 5.97F;

        float valorFinalAlcool = 0;
        float valorFinalGasolina = 0;

        switch (opcao){
            case 1:
                System.out.println("Digite a quantidade de Álcool em L");
                int alcoolQuantidadePorLitro = scanner.nextInt();

                if(alcoolQuantidadePorLitro <= 20)
                    valorFinalAlcool = alcoolPreco * alcoolQuantidadePorLitro;
                    System.out.println("Valor total da gasolina");
                    break;
            case 2:
                System.out.println("Digite a quantidade de Gasolina em L");
                int gasolinaQuantidadePorLitro = scanner.nextInt();

                break;
        }
    }
}