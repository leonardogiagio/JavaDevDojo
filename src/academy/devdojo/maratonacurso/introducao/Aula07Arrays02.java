package academy.devdojo.maratonacurso.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Freeza";

        for(int i = 0; i < nomes.length; i++) {
            System.out.println("for: " + nomes[i]);
        }

        nomes = new String[5];
        System.out.println(nomes[0]);
    }
}
