import java.util.Scanner;

public class MostraMatriz {

    public static void mostraVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            // System.out.printf("v[%d] = %d  ", i, v[i]);
            System.out.print(v[i]);
            if (i < v.length-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void mostraMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            mostraVetor(m[i]);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] x = {1, 2, 3, 4, 5, 6};
        int [] y = {10, 20, 30, 40};
        int [] z = {-10, -2, -1, 5, 10, 5, 10, 15, 20};

        mostraVetor(x);
        mostraVetor(y);
        mostraVetor(z);

        System.out.println("======\n");

        int [][] m = { 
            { 0, 0, 0},
            { 0, 0, 0},
            { 0, 0, 0}
        };
        mostraMatriz(m);
    }
}
