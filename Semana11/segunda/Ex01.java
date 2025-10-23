import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor = 0, qtdPar = 0, qtdImpar = 0, maiorPar = 0, menorImpar = 0;
        float mediaPar = 0;
        float mediaImpar = 0;
        while (valor >= 0) {
            valor = in.nextInt();

            if (valor >= 0) {
                if (valor % 2 == 0) {
                    System.out.println("PAR");
                    mediaPar = mediaPar + valor;
                    qtdPar++;

                    if (valor > maiorPar) {
                        maiorPar = valor;
                    }
                } else {
                    System.out.println("IMPAR");
                    mediaImpar = mediaImpar + valor;
                    qtdImpar++;

                    if (valor < menorImpar || qtdImpar == 1) {
                        menorImpar = valor;
                    } 
                }
             }
        }

        mediaPar = mediaPar/qtdPar;
        mediaImpar = mediaImpar/qtdImpar;

        System.out.println("MEDIA DOS PARES = " +  mediaPar);
        System.out.println("MEDIA DOS IMPARES = " +  mediaImpar);

        System.out.println("MAIOR PAR " + maiorPar );
        System.out.println("MENOR IMPAR " + menorImpar );

    }
}
