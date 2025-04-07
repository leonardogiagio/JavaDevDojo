package academy.devdojo.maratonacurso.javacore.Gassociacao.test;

import academy.devdojo.maratonacurso.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonacurso.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");

        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador2.setTime(time);

        jogador1.imprime();
        jogador2.imprime();
    }
}