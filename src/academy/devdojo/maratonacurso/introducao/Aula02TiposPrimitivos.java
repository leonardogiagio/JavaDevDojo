package academy.devdojo.maratonacurso.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 25;
        int valorMaior = (int)10000000L;
        double salarioDouble = 10000.0;
        long salarioLong = 10000000000000L;
        float salarioFloat = 5000.0f;
        byte idadeByte = 25;
        short idadeShort = 25;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        System.out.println("Idade: " + idade);
        System.out.println("valorMaior: " + valorMaior);
        System.out.println("salarioDouble: " + salarioDouble);
        System.out.println("salarioFloat: " + salarioFloat);
        System.out.println("salarioLong: " + salarioLong);
        System.out.println("idadeByte: " + idadeByte);
        System.out.println("idadeShort: " + idadeShort);
        System.out.println("verdadeiro: " + verdadeiro);
        System.out.println("falso: " + falso);
        System.out.println("caractere: " + caractere);


        // string não é um tipo primitivo
        String nome = "Leonardo Giagio";

        System.out.println(nome);
    }
}
