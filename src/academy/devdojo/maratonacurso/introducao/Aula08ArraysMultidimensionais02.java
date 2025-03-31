package academy.devdojo.maratonacurso.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1,2,3};
        arrayInt[1] = new int[]{1,2,3,4};
        arrayInt[2] = new int[]{1,2};

        for(int[] arrBase : arrayInt) {
            System.out.println("\n-------");
            for(int num : arrBase) {
                System.out.print(num + " ");
            }
        }


        int[][] arrayInt2 = {{1,2,3}, {1,2}, {1,2,3,4}};

        for(int[] arrBase : arrayInt2) {
            System.out.println("\n------");
            for(int num : arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
