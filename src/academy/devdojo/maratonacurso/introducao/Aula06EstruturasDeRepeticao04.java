package academy.devdojo.maratonacurso.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 20000;

        for(int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if(valorParcela >= 1000) {
                break;
            }

            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }
    }
}
