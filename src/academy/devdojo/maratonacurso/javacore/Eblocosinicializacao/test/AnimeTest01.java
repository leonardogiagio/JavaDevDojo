package academy.devdojo.maratonacurso.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonacurso.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");

        for(int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
