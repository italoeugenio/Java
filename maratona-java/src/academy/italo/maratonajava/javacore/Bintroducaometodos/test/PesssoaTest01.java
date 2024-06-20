package academy.italo.maratonajava.javacore.Bintroducaometodos.test;

import academy.italo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PesssoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Charllote");
        pessoa.setIdade(12);
        pessoa.imprime();

//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());

    }
}
