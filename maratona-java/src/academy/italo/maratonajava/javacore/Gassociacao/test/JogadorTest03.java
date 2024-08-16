package academy.italo.maratonajava.javacore.Gassociacao.test;

import academy.italo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.italo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Handy");
        Jogador jogador2 = new Jogador("Cyber");

        Time time = new Time("Faze");

        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----Jogador----");
        jogador.imprime();

        System.out.println("----Time----");
        time.imprime();
    }
}
