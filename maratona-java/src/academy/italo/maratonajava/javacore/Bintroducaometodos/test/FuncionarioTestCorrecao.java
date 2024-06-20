package academy.italo.maratonajava.javacore.Bintroducaometodos.test;

import academy.italo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioCorrecao;

public class FuncionarioTestCorrecao {
    public static void main(String[] args) {
        FuncionarioCorrecao funcionarioCorrecao = new FuncionarioCorrecao();
//        FuncionarioCorrecao funcionarioCorrecao2 = new FuncionarioCorrecao();
        FuncionarioCorrecao funcionarioCorrecao3 = new FuncionarioCorrecao();

        //Teste concluida não alterara o funcionário 1
        funcionarioCorrecao.setNome("Naruto");
        funcionarioCorrecao.setIdade(15);
        funcionarioCorrecao.setSalarios(new double[]{1200, 987.32, 2000});
        funcionarioCorrecao.imprime();
//        funcionarioCorrecao2.setNome("Sasuke");
//        funcionarioCorrecao2.setIdade(17);
//        funcionarioCorrecao2.salarios = new double[]{15000, 987.32,2000};
//        funcionarioCorrecao2.imprime();


        //Preciso arrumar o método set para ele nao sobreescreve a media
        funcionarioCorrecao3.setNome("Alem4o");
        funcionarioCorrecao3.setIdade(23);
        funcionarioCorrecao3.setSalarios(new double[]{100000, 987.32, 2000});
        funcionarioCorrecao3.imprime();
        System.out.println("Média: " + funcionarioCorrecao3.getMedia());
    }
}
