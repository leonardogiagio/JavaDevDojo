package academy.devdojo.maratonacurso.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonacurso.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Corolla";
        carro.modelo = "Toyota";
        carro.ano = 2024;

        carro2.nome = "Honda civic";
        carro2.modelo = "Honda";
        carro2.ano = 2025;

        System.out.println("Carro 1: " + carro.nome);
        System.out.println("Carro 1: " + carro.modelo);
        System.out.println("Carro 1: " + carro.ano);

        System.out.println("Carro 2: " + carro2.nome);
        System.out.println("Carro 2: " + carro2.modelo);
        System.out.println("Carro 2: " + carro2.ano);
    }
}
