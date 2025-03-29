package academy.devdojo.maratonacurso.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo

        int diaSemana = 7;
        String textoDiaSemana;

        switch(diaSemana) {
            case 1:
                textoDiaSemana = "Domingo";
                break;
            case 2:
                textoDiaSemana = "Segunda";
                break;
            case 3:
                textoDiaSemana = "Terça";
                break;
            case 4:
                textoDiaSemana = "Quarta";
                break;
            case 5:
                textoDiaSemana = "Quinta";
                break;
            case 6:
                textoDiaSemana = "Sexta";
                break;
            case 7:
                textoDiaSemana = "Sábado";
                break;
            default:
                textoDiaSemana = "Dia inválido";
        }
        System.out.println(textoDiaSemana);
    }
}
