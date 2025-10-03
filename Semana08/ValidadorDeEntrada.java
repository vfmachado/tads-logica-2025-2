import java.util.Scanner;

public class ValidadorDeEntrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor = 0;

        while (valor < 1 || valor > 10) {
            System.out.println("informe um valor entre 1 e 10");
            valor = in.nextInt();
        }

        System.out.println("VALOR ACEITO");
    }
}
