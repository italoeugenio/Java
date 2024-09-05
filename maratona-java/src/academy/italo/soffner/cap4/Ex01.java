package academy.italo.soffner.cap4;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tentativas = 3;
        String senhaCorreta = "italo&camilla123456";

        while (tentativas > 0){
            System.out.print("DIGITE SUA SENHA:");
            String digiteSuaSenha = scanner.nextLine();

            if (digiteSuaSenha.equals(senhaCorreta)){
                System.out.println("SENHA CORRETA");
                break;
            } else {
                System.out.println("SENHA INCORRETA");
                tentativas--;
                System.out.printf("VOCE TEM %d, tentativas", tentativas);
                System.out.println();
                System.out.println();
            }

        }
            if (tentativas == 0){
                System.out.println("CARTÃO BLOQUEADO");
            }
    }
}
