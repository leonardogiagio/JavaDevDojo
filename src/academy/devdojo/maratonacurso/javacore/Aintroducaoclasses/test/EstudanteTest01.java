package academy.devdojo.maratonacurso.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonacurso.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Leonardo";
        estudante.idade = 25;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
