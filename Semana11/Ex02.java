import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = 12123;

        while (numero > 0) {
            numero = in.nextInt();
        
            boolean quadradoPerfeito = false;

            for (int i = 1; i < numero;  i++) {
                if (i * i == numero) {
                    System.out.println("QUADRADO PERFEITO");
                    quadradoPerfeito = true;
                    break;
                }   
            }

            if (!quadradoPerfeito) {
                System.out.println("NAO EH QUADRADO PERFEITO");
            }
        }

    }
}
