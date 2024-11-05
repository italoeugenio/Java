package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int soma = a + b;

        System.out.println("A soma entre A e B é: " + soma);
        if(soma < c ){
            System.out.println("A soma é menor que C");
        } else {
            System.out.println("A soma não é menor que o valor de C: " + c);
        }
    }
}
//https://www.dio.me/articles/lista-de-exercicios-para-treinar-logica-de-programacao