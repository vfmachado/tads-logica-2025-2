import java.util.Scanner;

public class Desenhando {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int L, C;

        L = in.nextInt();
        C = in.nextInt();

        int linha = 0;
        while (linha < L) {
            int contador = 0;
            while (contador < C) {
                System.out.print(" * ");
                contador++;
            }
            System.out.println();
            linha++;
        }

        System.out.println("\n\n");
        int totalAsteriscos = L * C;
        int astericos = 0;
        while (astericos < totalAsteriscos) {
            System.out.print(" * ");
            astericos++;
            if (astericos % C == 0) {
                System.out.println();    
            }
        }
    }

}
