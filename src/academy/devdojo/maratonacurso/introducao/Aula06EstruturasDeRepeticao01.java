package academy.devdojo.maratonacurso.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        while(count < 10) {
            System.out.println("while: " + count);
            count++;
        }

        int count2 = 0;

        do {
            System.out.println("do while: " + count);
            count2++;
        } while(count2 < 10);

        for(int i = 0; i < 10; i++) {
            System.out.println("for: " + i);
        }

    }
}
