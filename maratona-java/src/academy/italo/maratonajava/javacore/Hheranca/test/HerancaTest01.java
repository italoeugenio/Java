package academy.italo.maratonajava.javacore.Hheranca.test;

import academy.italo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.italo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.italo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 3");
        endereco1.setCep("72198873");

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("0123456789");
        pessoa.setEndereco(endereco1);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua 4");
        endereco2.setCep("19198198");

        Pessoa pessoa2 = new Pessoa("Camilla");
        pessoa2.setCpf("8919191956");
        pessoa2.setEndereco(endereco2);

        pessoa.imprime();
        System.out.println("---------");

        pessoa2.imprime();
        System.out.println("---------");

        Funcionario funcionario = new Funcionario("Caio Eugenio");
        funcionario.setCpf("1891981918");
        funcionario.setEndereco(endereco1);
        funcionario.setSalario(20000);

        funcionario.imprime();
        System.out.println("---------");
    }
}
