package academy.italo.soffner.cap1;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativas = 10;
        int numeroParaAdinhar = 5;

        while(tentativas > 0){
            System.out.print("Tente adivinhar o número: ");
            int numero = scanner.nextInt();

            if (numero == numeroParaAdinhar){
                System.out.println("Parabéns você acertou");
                break;
            } else {
                tentativas--;
                System.out.printf("VOCÊ ERROU E TEM %d TENTATIVAS\n\n", tentativas);
            }
        }
        if (tentativas == 0){
            System.out.println("Sinto muito você perdeu =/");
        }
    }
}
