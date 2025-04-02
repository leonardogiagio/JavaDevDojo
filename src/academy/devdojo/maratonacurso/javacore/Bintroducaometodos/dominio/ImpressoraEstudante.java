package academy.devdojo.maratonacurso.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("-------------------------");

        System.out.println("Nome: " + estudante.nome);
        System.out.println("idade: " + estudante.idade);
        System.out.println("sexo: " + estudante.sexo);
        estudante.nome = "Gohan";
    }
}
