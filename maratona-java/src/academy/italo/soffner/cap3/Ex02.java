package academy.italo.soffner.cap3;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade:");
        int idade = scanner.nextInt();

        if(idade <= 13){
            System.out.println("Infantil");
        } else if(idade <=17){
            System.out.println("Juvenil");
        } else if (idade > 17){
            System.out.println("Sênior");
        }
    }
}
