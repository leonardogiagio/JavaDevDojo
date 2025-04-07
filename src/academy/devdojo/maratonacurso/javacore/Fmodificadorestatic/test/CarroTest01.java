package academy.devdojo.maratonacurso.javacore.Fmodificadorestatic.test;

import academy.devdojo.maratonacurso.javacore.Fmodificadorestatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(100);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        c1.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
