import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int fatorial = 1;
        float divisao;
        float soma = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
            divisao = 1 / fatorial;
            soma = soma + divisao;
            System.out.println(i + "! = " + fatorial);
        }

        System.out.println(soma);
    }
}
