import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        // COMANDO BREAK SERVE PARA "FREAR"/"PARAR" O NOSSO LAÇO DE REPETICAO EXATAMENTE NO MOMENTO DE SUA EXECUCACAO
        while (true) {
            int a = in.nextInt();
            if (a == 9) {
                System.out.println("Antes da frase");
                break;      // para exatamente onde aparece o break, ou seja, as linhas do restante do bloco sao ignoradas
                // System.out.println("DEPOIS - nem compila");
            }
            System.out.println("SIGO EXECUTANDO NORMALMENTE");

        }

        System.out.println("RESTO DO CODIGO");
        // segue executando normal

        // break só aparece em dois cenarios
        // 1 - parar um laço de repetição (while, for, do..while)
        // 2 - para um caso (switch-case)
    }
}