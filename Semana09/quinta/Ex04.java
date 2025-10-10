import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        // SOMA DOS MULTIPLOS DE DIV NO INTERVALO [A, B]
        Scanner in = new Scanner(System.in);
        int a, b, div;
        a = in.nextInt();
        b = in.nextInt();
        div = in.nextInt();

        // intervalo [a, b]
        // int cont = a;
        // while (cont <= b) {
        //     System.out.println(cont);
        //     cont++;
        // }

        int soma = 0;
        //      inicializacao   valor logico
        for (int cont = a; cont <= b; cont++) {
                                        // passo (incremento)
            System.out.println(cont);
            if (cont % div == 0) {
                System.out.println(" eh multiplo");
                soma = soma + cont;
            }
        }

        System.out.println("Soma dos multiplos dentro do intervalo " + soma);
    }
}