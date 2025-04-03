package academy.devdojo.maratonacurso.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonacurso.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 22, "Ação");
        anime.imprime();
        anime.init("Akudama Drive2", "TV", 22, "Ação");
        anime.imprime();
    }
}
