import java.util.Scanner;

public class MultiplosIFs {
    public static void main(String[] args) {
        
        // faça um programa que dado o numero, (1 a 7), retorne o dia da semana (dom - sab)
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("Domingo");
        } else if (n == 2) {
            System.out.println("Segunda");
        } else if (n == 3) {
            System.out.println("Terca");
        } else if (n == 4) {
            System.out.println("Quarta");
        } else if (n == 5) {
            System.out.println("Quinta");
        } else if (n == 6) {
            System.out.println("Sexta");
        } else if (n == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Dia da semana invalido");
        }

        // escolha (variavel)
        switch (n) {
            case 1: 
                System.out.println("Domingo");
                break;  // cada caso (ou bloco de casos, é finalizado com break)
            case 2: 
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            // ...

            // caso padrao (quando nao entra em nenhun outro caso, vem parar aqui)
            default:
                System.out.println("Dia da semana invalido");
        }

    }
}
