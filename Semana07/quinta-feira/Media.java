import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // calcular a media de um quantidade N de valores (será inputador o valor -1 para encerrar a entrada)
        Scanner in = new Scanner(System.in);
        
        float valor = 0, soma = 0;
        int qtd = 0;
        // 1. WHILE QUE RECEBE VALORES ATÉ QUE SEJA DIGITADO -1
        //    !=  é diferente?     == é igual?
        while (valor != -1) {           
            valor = in.nextFloat();
            if (valor != -1) {
                soma = soma + valor;
                qtd++;
            }
            System.out.println("FORAM DIGITADOS " + qtd + " E A SOMA PARCIAL EH " + soma);
        }   

        
        System.out.println("Quantidade digitada: " + qtd);
        float media = soma / qtd;
        System.out.println("MEDIA DA TURMA FOI " + media);
        
        // 2. CONTAR QUANTOS VALORES VALIDOS FORAM DIGITADOS
        // 3. SOMAR OS VALORES DIGITADOS
        // 4. FORA DO WHILE CALCULAR A MEDIA (SOMA / QUANTIDADE)
        // 5. MOSTRAR O RESULTADO E SER FELIZ =)
    }   
}
