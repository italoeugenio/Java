package academy.italo.soffner.cap3;

import java.util.Objects;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senhaDoUsuario = "italo&camilla123";
        int tentativas = 5;

        while(tentativas > 0){
            System.out.print("Digite a sua senha: ");
            String senha = scanner.nextLine();

            if (Objects.equals(senha, senhaDoUsuario)){
                System.out.println("Senha correta");
                break;
            } else {
                tentativas--;
                System.out.printf("Senha inválida. voce tem %d tentativas\n", tentativas);
            }
        }
        if (tentativas == 0){
            System.out.println("ACESSO BLOQUEADO");
            System.out.println("ENTRE EM CONTATO NO NOSSO SUPORTE");
        }
    }
}