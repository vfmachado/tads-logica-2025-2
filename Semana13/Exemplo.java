import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String palavra = "THEODORO";    // palavra.length()
        char [] letras = palavra.toCharArray();  // converte um texto (string) em vetor de letras

        // .length retorna o tamanho do meu vetor
        System.out.println("TAMANHO: " + letras.length);

        while (true) {
            // .next() => le uma string
            // .toUpperCase() => DEIXA TUDO EM MAIUSCULO
            // .charAt(0) => pega apenas a primeira posicao
            char digitado = in.next().toUpperCase().charAt(0);

            System.out.println("O usuario digitou " + digitado);
            boolean encontrei = false;
            // verificar em quais posicoes aparece a letra digitada
            for (int i = 0; i < letras.length; i++) {
                char letra = letras[i]; // facilitar o entendimento do codigo
                if (digitado == letra) {
                    System.out.println("Tem na posicao " + i);
                    encontrei = true;
                }
            }
            if (!encontrei) {
                System.out.println("NAO TEM A LETRA");
            }
        }

    }


}