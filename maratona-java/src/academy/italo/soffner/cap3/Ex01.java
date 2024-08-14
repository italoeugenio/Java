package academy.italo.soffner.cap3;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de folhas:");
        int numDeFolhas = scanner.nextInt();

        float valorDaFolhas = 0.25F;

        if (numDeFolhas > 100){
            valorDaFolhas = 0.20F;
        }

        System.out.printf("O número de folha foi %d, então valor total é R$%.2f", numDeFolhas, (valorDaFolhas*numDeFolhas));
    }
}
