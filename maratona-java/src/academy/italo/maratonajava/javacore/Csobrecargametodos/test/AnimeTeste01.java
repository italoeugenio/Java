package academy.italo.maratonajava.javacore.Csobrecargametodos.test;

import academy.italo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

//        anime.init("Death Note", "TV", 27);
        anime.init("Death Note", "TV", 27, "Terror");
        anime.imprime();

    }
}
