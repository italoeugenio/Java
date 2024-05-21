package academy.italo.loiane.exercicios.condicionais;

import java.util.Scanner;

public class Ex01 {
//    https://github.com/loiane/curso-java-basico/blob/master/exercicios/Exercicios%20Aulas%2014%2015.pdf
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Write the num1:");
    int num1 = scan.nextInt();

    System.out.print("Write the num2:");
    int num2 = scan.nextInt();

    if(num1 > num2){
        System.out.println(String.format("The number %d is greater than %d", num1, num2));
    } else if(num2 > num1){
        System.out.println(String.format("The number %d is greater than %d", num2, num1));
    } else {
        System.out.println("They are equals");
        }

        scan.close();
    }
}
