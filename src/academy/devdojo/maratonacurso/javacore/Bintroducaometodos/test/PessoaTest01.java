package academy.devdojo.maratonacurso.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonacurso.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        pessoa.imprime();
    }
}
