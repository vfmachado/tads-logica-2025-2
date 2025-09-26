import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        final int QUANT_NUMEROS = 100;
        
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();
        int escolha, tentativas = 1;;
        int numero = aleatorio.nextInt(QUANT_NUMEROS);

        System.out.println("Adivinhe o numero?");
        escolha = in.nextInt();

        while (numero != escolha) {
           
            if (tentativas % 5 == 0) {
                System.out.println("SORTEANDO NOVO NUMERO");
                numero = aleatorio.nextInt(QUANT_NUMEROS);
            } else {
                if (escolha <  numero) {
                    System.out.println("TENTE MAIOR");
                } else {
                    System.out.println("TENTE MENOR");
                }
            } 

            System.out.println("Tente novamente");
            escolha = in.nextInt();
            tentativas++;

        }
       
        System.out.println("VC ACERTOU");
        System.out.println("NUMERO DE TENTATIVAS " + tentativas);
    }
}
