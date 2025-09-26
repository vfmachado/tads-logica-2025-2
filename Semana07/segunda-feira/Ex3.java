import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // a menor
        if (a < b && b < c) {
            System.out.printf("%d %d %d", a, b, c);
        }

        if (a < c && c < b) {
            System.out.printf("%d %d %d", a, c, b);
        }

        // b menor
        if (b < a && a < c) {
            System.out.printf("%d %d %d", b, a, c);
        }

        if (b < c && c < a) {
            System.out.printf("%d %d %d", b, c, a);
        }

        // c menor
        if (c < a && a < b) {
            System.out.printf("%d %d %d", c, a, b);
        }

        if (c < b && b < a) {
            System.out.printf("%d %d %d", c, b, a);
        }
    }
}
