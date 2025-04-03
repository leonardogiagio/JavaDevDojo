package academy.devdojo.maratonacurso.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    // 1 - alocado espaco em memoria pro objeto
    // 2 - cada atributo de classe é criado e inicializado com valores defautl ou o que for passado
    // 3 - bloco de inicializaçao é executado
    // 4 - construtor é executado


    // bloco de inicializacao
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public int[] getEpisodios() {
        return this.episodios;
    }

}
