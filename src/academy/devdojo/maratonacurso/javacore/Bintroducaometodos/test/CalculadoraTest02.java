package academy.devdojo.maratonacurso.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonacurso.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(5,5);
        System.out.println(result);

        calculadora.imprimeDivisaoDoisNumeros(5,0);
    }
}
