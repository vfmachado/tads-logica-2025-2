import java.util.Scanner;

public class OperadoresLogicos {
   
    public static void main(String[] args) {
        
        // 5 > 3   true 
        // a > b   ???
        
        Scanner in = new Scanner(System.in);
        System.out.println("A = ");
        int a = in.nextInt();
        System.out.println("B = ");
        int b = in.nextInt();
        
        boolean resposta = a > b;
        System.out.println(resposta);

        // se (a > b) entao
        // if (resposta) {
        if (a > b) {
            System.out.println("A é maior B");
        }

        /*
        ESTRUTURA DE CONTROLE QUE SERVE PARA EXECUTAR OU NAO DETERMINADO BLOCO DE CODIGO

            if (valor_logico) {
                // bloco
            }

        OPERADORES LOGICOS

            >       MAIOR QUE?          
            >=      MAIOR OU IGUAL?
            <       MENOR QUE?
            <=      MENOR OU IGUAL?
            ==      É IGUAL?
            !=      É DIFERENTE?        5 != 3  => true  5 != 5 => false

            !  => NAO       !true => false      !false => true
               nao fazer isto => naoGanhou       !naoGanhou
               fazer isto =>   ganhou      !ganhou

            &&     => e 
                verdadeiro quando ambos valores logicos sao verdadeiros

            ||     => ou
                verdadeiro quando pelo menos valor é verdadeiro

            int a;
            a = 5;  // atribuição de valor 5 na variavel a
            a == 5  // comparacao do valor de a com 5 => resulta em verdadeiro/falso
         */

        //System.out.println("B é maior");
    }

}
