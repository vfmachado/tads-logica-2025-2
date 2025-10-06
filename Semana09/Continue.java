import java.util.Scanner;

public class Continue {
    
    public static void main(String[] args) {
        
        // FACA UM PROGRAMA QUE RECEBA 10 NOTAS VALIDAS E CALCULE A MEDIA;
        // POR EXEMPLO, SE DIGITADA UMA NOTA INVALIDA, DEVE SER IGNORADA TANTO NA MEDIA QUANTO NA CONTAGEM
        // NOTA VALIDA É ALGO NO INTERVALO [0, 10]
        Scanner in = new Scanner(System.in);
        float nota, soma = 0;
        
        for (int i = 0; i < 10; i++) {
            nota = in.nextFloat();
            if (nota < 0 || nota > 10) {
                i--;
                continue;    // ignora os codigos abaixo (dentro do laço) mas continua executando o laço de repetição
            }
            
            // esse bloco poderia ter varias e varias linhas com varios ifs a gosto do cliente.
            soma = soma + nota;
        }
    }

}
