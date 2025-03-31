package academy.devdojo.maratonacurso.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonacurso.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Leonardo";
        estudante.idade = 25;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante2.nome = "Kay";
        estudante2.idade = 21;
        estudante2.sexo = 'F';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
