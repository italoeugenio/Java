package academy.italo.maratonajava.javacore.Oexception.exception.test;

import academy.italo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args)  {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Teste");
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "SAO";
        String senhaDB = "KIRITO";

        System.out.print("Usuário: ");
        String usernameDigitado = scanner.nextLine();

        System.out.print("Senha:");
        String senhadigitada = scanner.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhadigitada.equals(senhadigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
