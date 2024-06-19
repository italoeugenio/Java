package academy.italo.maratonajava.javacore.Bintroducaometodos.test;

import academy.italo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioCorrecao;

public class FuncionarioTestCorrecao {
    public static void main(String[] args) {
        FuncionarioCorrecao funcionarioCorrecao = new FuncionarioCorrecao();
        FuncionarioCorrecao funcionarioCorrecao2 = new FuncionarioCorrecao();
        FuncionarioCorrecao funcionarioCorrecao3 = new FuncionarioCorrecao();

        funcionarioCorrecao.nome = "Naruto";
        funcionarioCorrecao.idade = 15;
        funcionarioCorrecao.salarios = new double[]{1200, 987.32,2000};
        funcionarioCorrecao.imprime();
        funcionarioCorrecao2.nome = "Sasuke";
        funcionarioCorrecao2.idade = 17;
        //funcionarioCorrecao2.salarios = new double[]{15000, 987.32,2000};
        funcionarioCorrecao2.imprime();
        funcionarioCorrecao3.nome = "Alem4o";
        funcionarioCorrecao3.idade = 23;
        funcionarioCorrecao3.salarios = new double[]{100000, 987.32,2000};
        funcionarioCorrecao3.imprime();
    }
}
