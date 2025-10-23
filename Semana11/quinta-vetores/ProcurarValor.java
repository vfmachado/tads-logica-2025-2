import java.util.Scanner;

public class ProcurarValor {
    public static void main(String[] args) {
        int [] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 50, 90, 100};

        // procurar a posicao de um valor digitado pelo usuario
    
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();
        boolean encontrado = false;
        // mostrar em quais posicoes tem aquele valor
        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                System.out.println("POSICAO " + i);
                encontrado = true;
            }
        }

        // indicar se nao encontrou o valor
        if (!encontrado) {
            System.out.println("NAO ENCONTREI O VALOR EM NENHUMA POSICAO");
        }
    }
}
