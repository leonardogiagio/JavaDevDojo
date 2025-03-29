package academy.devdojo.maratonacurso.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoacao = "";

        if(salario >= 5000) {
            mensagemDoacao = "Eu vou doar 500 pro DevDojo";
        } else {
            mensagemDoacao = "Não vou doar";
        }

        System.out.println(mensagemDoacao);

        mensagemDoacao = (salario >= 5000) ? "Eu vou doar 500 pro DevDojo" : "Eu não vou doar";

        System.out.println(mensagemDoacao);
    }
}
