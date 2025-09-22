import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float valor, totalArrecadado, totalNaoArrecadado;
        int qtdtotal, qtdPagantes, qtdSocios, qtdNaoPagantes;

        System.out.println("informe valor ingresso,  pagantes,  socios, nao pagantes");
        valor = in .nextFloat();
        qtdPagantes = in.nextInt();
        qtdSocios = in.nextInt();
        qtdNaoPagantes = in.nextInt();

        qtdtotal = qtdPagantes + qtdSocios + qtdNaoPagantes;
        totalArrecadado = qtdPagantes * valor + qtdSocios * valor * 0.7f;
        totalNaoArrecadado = qtdNaoPagantes * valor + qtdNaoPagantes * valor * 0.3f;

        System.out.println("Total de pessoas no evento " + qtdtotal);
        System.out.println("Total arrecadado " + totalArrecadado);
        System.out.println("Deixou de ser arrecadado " + totalNaoArrecadado);
        

    }
}
