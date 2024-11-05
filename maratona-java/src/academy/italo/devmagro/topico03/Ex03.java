package academy.italo.devmagro.topico03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = 0;

        if(A == B){
            C = A + B;
        } else {
            C = A * B;
        }

        System.out.println("Valor de C = " + C);
    }
}
