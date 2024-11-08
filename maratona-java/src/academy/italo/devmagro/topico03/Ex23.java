package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da hora da aula: ");
        float valorDaAula = scanner.nextFloat();

        System.out.print("Número de aulas lecionadas no mês: ");
        int numeroDeAulas = scanner.nextInt();

        System.out.print("Percentual de desconto do INSS (0,3 = 30%): ");
        float percentual = scanner.nextFloat();

        float salarioLiquido = (valorDaAula * numeroDeAulas) - (valorDaAula * numeroDeAulas * percentual);
        System.out.println("Salário Liquido: " + salarioLiquido);

    }
}
