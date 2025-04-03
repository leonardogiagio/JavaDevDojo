package academy.devdojo.maratonacurso.javacore.Dconstrutores.test;

import academy.devdojo.maratonacurso.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 500, "Ação", "Teste");
        anime.imprime();
    }
}
