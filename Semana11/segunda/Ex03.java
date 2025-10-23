import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int n = 100; n <= 999; n++) {

            int u = n % 10;
            int d = (n / 10) % 10;
            int c = n / 100;
            //System.out.printf("%d  U = %d   D = %d   C = %d\n", n, u, d, c);

            // crescente
            if (d - u == 1 && c - d == 1) {
                int produto = u * d * c;
                System.out.println(n  + "  " + produto);
            }

            // decrescente
            if (u - d == 1 && d - c == 1) {
                int produto = u * d * c;
                System.out.println(n  + "  " + produto);
            }
 
        }
    }
}
