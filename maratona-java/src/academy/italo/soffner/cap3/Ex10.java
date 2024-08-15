package academy.italo.soffner.cap3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        double delta = (B*B) - (4*A*C);
        double x1 = (-B + Math.sqrt(delta))/ (2*A);
        double x2 = (-B - Math.sqrt(delta))/ (2*A);
        if(delta > 0){
            System.out.println("Há duas raizes");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (delta == 0){
            System.out.println("Só há 1 raiz");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else {
            System.out.println("Não há raizes");
        }
    }
}
