package academy.italo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.italo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
