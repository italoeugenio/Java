package academy.italo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Write the num1:");
        int num1 = scan.nextInt();

        System.out.print("Write the num2:");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println(String.format("The number %d is greater than %d if(1)", num1, num2));
        }

        if(num2 > num1){
            System.out.println(String.format("The number %d is greater than %d if(2)", num2, num1));
        }
    }
}
