package academy.italo.maratonajava.javacore.Dconstrutores.dominio.test;


import academy.italo.maratonajava.javacore.Dconstrutores.dominio.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Death note", "Tv", 15,"Terror","Japones");
        anime.imprime();
    }
}
