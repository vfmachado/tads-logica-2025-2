import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String n1, n2;
        int c1, c2, pont;
        
        System.out.println("informe naipe e valor 2x");
        n1 = in.next();
        c1 = in.nextInt();

        n2 = in.next();
        c2 = in.nextInt();

        // naipes iguais
        if (c1 == c2) {
            pont = c1 * c1;
        }
        else if (n1.equals(n2)) {
            // seq
            if (c2 - c1 == 1 || c2 - c1 == -1) {
                pont = c1 * c2;

            // nao seq
            } else {
                if (c2 > c1) {
                    pont = c2;
                } else {
                    pont = c1;
                }
            }
        // naipes diferentes
        } else {
            // seq
            if (c2 - c1 == 1 || c2 - c1 == -1) {
                pont = c1 + c2;
            } else {
                if (c2 > c1) {
                    pont = c2 - c1;
                } else {
                    pont = c1 - c2;
                }
            }
        }
        
        System.out.println("PONTUACAO " + pont);
    }
}
