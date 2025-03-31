package academy.devdojo.maratonacurso.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {21, 15, 30};

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("for: " + numeros[i]);
        }

        for(int numero : numeros) {
            System.out.println("foreach: " + numero);
        }
    }
}
