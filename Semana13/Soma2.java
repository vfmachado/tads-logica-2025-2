import java.util.Scanner;

public class Soma2 {
    public static void main(String[] args) {
        
        int [] v = { 1, 2, 5, 2, 3, 5, 6, 8, 11, 2, 3, 4, 5, 8 };

        // dado um valor n escolhido pelo usuario, indicar se existem 2 valores dentro de v que somados resultem em n.

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < v.length; i++) {
            for (int j = i+1; j < v.length; j++) {
                if (v[i] + v[j] == n) {
                    System.out.printf("SOMA ENCONTRADA v[%d] = %d  e   v[%d] = %d\n", i, v[i], j, v[j]);
                }
            }

        }


    }
}
