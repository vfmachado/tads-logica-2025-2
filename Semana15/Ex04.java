import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        int t = 10;
        int[] v = new int[t];
        int[] z = new int[t];

        // Preencher o array com números aleatórios entre 1 e 100
        for (int i = 0; i < t; i++) {
            v[i] = aleatorio.nextInt(100) + 1;
            System.out.print(v[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }

        int indiceZ = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                z[indiceZ] = v[i];
                indiceZ++;
            }
        }

        
        for (int i = v.length -1; i >= 0; i--) {
            if (v[i] % 2 != 0) {
                z[indiceZ] = v[i];
                indiceZ++;
            }
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();
    }
}
