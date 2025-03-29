package academy.devdojo.maratonacurso.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        /*
        utilizando switch e dados os valores de 1 a 7, imprima se é dia util ouu final de semana
         */

        int diaSemana = 1;
        String mensagem = "";

        switch(diaSemana) {
            case 1:
                mensagem = "Fim de semana";
                break;
            case 2:
                mensagem = "Meio de semana";
                break;
            case 3:
                mensagem = "Meio de semana";
                break;
            case 4:
                mensagem = "Meio de semana";
                break;
            case 5:
                mensagem = "Meio de semana";
                break;
            case 6:
                mensagem = "Meio de semana";
                break;
            case 7:
                mensagem = "Fim de semana";
                break;
        }

        System.out.println(mensagem);
    }
}
