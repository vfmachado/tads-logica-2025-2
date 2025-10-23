import java.util.Scanner;

public class ExMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float media = 0;

        float primeiro;
        
        // inicia o valor de i com 0
        // enquanto o valor de i for menor que 5
        // executa o bloco
        // i++
        // volta no teste logico
        for (int i = 0; i < 50; i++) {
            float nota = in.nextFloat();
            media = media + nota;

            if (i == 0) {
                primeiro = nota;
            }
            
        }


        media = media / 5;

        // qual foi o primeiro valor digitado?
        // mostre todos os valores na ordem inversa


    }
}