import java.util.Scanner;

public class ExNomes {
    public static void main(String[] args) {
        
        // faça um programa que leia o nome de 5 pessoas
        Scanner in = new Scanner(System.in);
        
        // se temos varias variaveis que operam como se fosse um grupo / ou apenas uma é um indicativo que devemos utilizar um vetor
        String nome1, nome2, nome3, nome4, nome5;   // mesmo tipo, mesmo contexto, mesmo objetivo
        
        String [] nomes;  // prefiro desta forma pela questao semantica
        // String nomes [];
        // inicialização
        nomes = new String[5];
        
        // variavel[posicao] 
        // atribuindo valores para o array/vetor
        // nomes[0] = in.next();
        // nomes[1] = in.next();
        // nomes[2] = in.next();
        // nomes[3] = in.next();
        // nomes[4] = in.next();

        // escopo - o valor de i só vale para este for
        for (int i = 0; i < 5; i++) {  // i = 0 até 4 (inclusive)  // < 5
            // para cada valor de i
            // nomes na posicao i recebe o valor digitado
            nomes[i] = in.next();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        
        
    }
}
