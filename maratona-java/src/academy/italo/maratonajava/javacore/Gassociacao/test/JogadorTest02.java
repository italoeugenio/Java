package academy.italo.maratonajava.javacore.Gassociacao.test;

import academy.italo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.italo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Nesk");
        Time time = new Time("Team Liquid");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
