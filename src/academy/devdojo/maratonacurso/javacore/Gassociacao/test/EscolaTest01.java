package academy.devdojo.maratonacurso.javacore.Gassociacao.test;

import academy.devdojo.maratonacurso.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonacurso.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();


    }
}
