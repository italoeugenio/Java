package academy.italo.soffner.cap1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num1 = 10F;
        float num2 = 2F;
        System.out.println("Numeros: " + num1 +" e "+ num2);
        System.out.println("Soma: "+ (num1+num2));
        System.out.println("Subtração: " + (num1-num2));
        System.out.println("divisão: " + (num1/num2));
        System.out.println("multiplicação: " + (num1*num2));
    }
}
