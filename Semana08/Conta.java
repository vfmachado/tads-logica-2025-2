import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        char opcao = 'X';
        float saldo = 0;

        while (opcao != 'd') {
            System.out.println("a - consultar saldo\nb - saque\nc - deposito\nd - sair");
            opcao = in.next().charAt(0);
            if (opcao == 'a') {
                System.out.println(saldo);
            } 

            if (opcao == 'b') {
                System.out.println("Valor do saque?");
                float valor = in.nextFloat();
                saldo = saldo - valor;
            }

            if (opcao == 'c') {
                System.out.println("Valor do deposito?");
                float valor = in.nextFloat();
                saldo = saldo + valor;
            }
        }
    }
}
