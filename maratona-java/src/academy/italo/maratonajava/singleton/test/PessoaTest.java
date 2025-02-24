package academy.italo.maratonajava.singleton.test;

import academy.italo.maratonajava.singleton.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.getInstance();
        pessoa.setName("edrick");

        Pessoa pessoa2 = Pessoa.getInstance();
        pessoa2.setName("italo");

        System.out.println(pessoa.getName());
        System.out.println(pessoa2.getName());
    }
}
