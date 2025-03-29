package academy.devdojo.maratonacurso.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // OPERADORES ARITMÉTICOS
        // + - / * %
        int numero01 = 10;
        int numero02 = 20;
        int adicao = numero01 + numero02;
        int subtracao = numero01 - numero02;
        double divisao = numero01 / (double) numero02;
        int multiplicacao = numero01 * numero02;

        System.out.println("Adição: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);


        // OPERADORES RELACIONAIS
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);


        // OPERADORES LÓGICOS
        // || && !
        int idade = 18;
        boolean terminouEnsinoMedio = true;
        boolean idadeCorretaEnsinoMedio = idade <= 18 && terminouEnsinoMedio;

        System.out.println("idadeCorretaEnsinoMedio: " + idadeCorretaEnsinoMedio);



        // OPERADORES DE ATRIBUIÇÃO
        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus += 1000;

        System.out.println("Bonus: " + bonus);


        // OPERADORES UNARIOS
        int contador = 0;
        contador++;
        System.out.println("Contador: " + contador);
    }
}
