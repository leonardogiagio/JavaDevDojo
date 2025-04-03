package academy.devdojo.maratonacurso.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);

        System.out.print("Salários: ");
        for(double salario : this.salarios) {
            System.out.print(salario + "; ");
        }
    }

    public void mediaSalarial() {
        double media = 0;
        double totalSalario = 0;
        for(double salario : this.salarios) {
            totalSalario += salario;
        }

        media = totalSalario / this.salarios.length;

        System.out.println("\nMédia: " + media);
    }
}
