package academy.devdojo.maratonacurso.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonacurso.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Leonardo";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{570.0, 1500.0, 4.900};

        funcionario.imprimirDados();
        funcionario.mediaSalarial();
    }
}
