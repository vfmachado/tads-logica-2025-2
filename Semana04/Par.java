import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // FACA UM PROGRAMA PARA IDENTIFICAR SE UM NUMERO É PAR OU IMPAR
        // O RESTO DA DIVISAO POR 2 INDICA SE UM NUMERO PAR OU IMPAR. POR EXEMPLO QUALQUER NUMERO PAR, DIVIDIDO POR 2 TEM RESTO 0; QLQR NUMERO IMPAR RESTO 1;
        int n, resto;
        
        System.out.println("informe um numero");
        n = in.nextInt();
        
        resto = n % 2;      // por exemplo, n = 7   n % 2 = 1
        boolean par = resto == 0;
        if (par) {
        // if (n % 2 == 0)
            System.out.println(n + " NUMERO PAR");
        
        // senao - NAO TEM CONDICAO
        } else {
            System.out.println(n + " NUMERO IMPAR");
        }


        // FACA UM PROGRAMA QUE DADOS DOIS NUMEROS (A, B) FACA A DIVISAO DE A POR B SE POSSIVEL (b != 0)

        // FACA UM PROGRAMA QUE VERIFIQUE SE A É MULTIPLO DE B
    }
}
