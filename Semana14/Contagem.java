import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v = new int[10];

        while (true) {
            int digitado = in.nextInt();
            if (digitado == -1) break;

            // transformado de 1 a 5 para 0 a 4
            v[digitado -1]++;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println((i+1) + " contou " + v[i]);
        }
    }
}
