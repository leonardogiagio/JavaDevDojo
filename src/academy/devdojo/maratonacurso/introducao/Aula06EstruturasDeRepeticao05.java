package academy.devdojo.maratonacurso.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            if(i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
