package academy.italo.maratonajava.javacore.Npolimorfismo.test;

import academy.italo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.italo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();

        repositorio.salvar();
    }
}
