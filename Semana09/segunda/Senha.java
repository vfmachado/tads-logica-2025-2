import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String senha = "1234";
        String digitado;

        // O DO WHILE GARANTE PELO MENOS 1 EXECUCAO DO BLOCO
        // PQ PRIMEIRO EXECUTA O BLOCO E DEPOIS TESTA
        do {
            digitado = in.next();
        } while (!senha.equals(digitado));

        System.out.println("ACERTOU");
    }
}