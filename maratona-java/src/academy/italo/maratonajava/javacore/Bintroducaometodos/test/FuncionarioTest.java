package academy.italo.maratonajava.javacore.Bintroducaometodos.test;

import academy.italo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Ítalo";
        funcionario.idade = 20;
        funcionario.salario = new float[] {12.5f,15,15};

        funcionario.imprimirDados(funcionario);
        float media = funcionario.mediaDoSalario(funcionario.salario);
        System.out.printf("Média dos salários: %.2f%n", media);
    }
}
