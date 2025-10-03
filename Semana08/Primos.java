import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        

        // 1. fazer um programa para verificar se um numero N é primo
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // DESCOBRIR SE ELE É DIVISIVEL POR NUMEROS > 1 E < N
        int div = 2;
        int encontrados = 0;    // onde a variavel é declarada indica o escopo da variavel, caso vc declare dentro do if, apenas dentro do if ela vai existir
        while (div <= n/2) {
            // System.out.println("possivel divisor " + div);

            if (n % div == 0) {
                System.out.println(div + " É UM DIVISOR");   
                encontrados++;
            }

            div++;
        }

        if (encontrados == 0) {
            System.out.println("PRIMO");
        } else {
            System.out.println("NAO EH PRIMO!");
        }
        // 2. fazer um programa que mostre os 20 primeiros elementos da sequencia de fibonacci
        //   1 1 2 3 5 8 13 ...
        //         ^ 1 + 2

        // 3. Dado dois numeros, encontrar o MDC (maior divisor comum)

        // 4. Decompor um numero em fatores primos
        // 90 =>  2 * 3 * 3 * 5


    }
}