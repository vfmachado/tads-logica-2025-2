import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int linhas = in.nextInt();
        int colunas = in.nextInt();
        
        
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                
                if (linha == 0 || linha == linhas -1 || coluna == 0 || coluna == colunas-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }


        
        
    }
}
