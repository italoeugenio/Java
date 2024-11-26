package academy.italo.maratonajava.javacore.Oexception.exception.test;

import academy.italo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.italo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.italo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritraComExceptionTest01 {
    public static void main(String[] args) throws FileNotFoundException, LoginInvalidoException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
        pessoa.salvar();
    }
}
