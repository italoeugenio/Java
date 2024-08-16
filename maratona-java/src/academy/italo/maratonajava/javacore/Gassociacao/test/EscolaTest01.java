package academy.italo.maratonajava.javacore.Gassociacao.test;

import academy.italo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.italo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Remis");
        Professor professor2 = new Professor("Kauã");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Colégio UCB", professores);

        escola.imprime();
    }
}
