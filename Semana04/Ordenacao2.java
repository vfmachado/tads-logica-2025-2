import java.util.Scanner;

public class Ordenacao2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a, b;

        a = in.nextInt();
        b = in.nextInt();

        // preencha aqui
        if (a >= b) {
            System.out.println(a + ", " + b);
        }

        // preencha aqui
        if (b > a) {
            System.out.println(b + ", " + a);
        }
    }
}
