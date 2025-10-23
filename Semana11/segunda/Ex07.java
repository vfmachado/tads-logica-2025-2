import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // primeiro triangulo
        int linhas = n / 2 + 1;
        int colunas = linhas * 2 - 1;
        int meio = colunas/2;
        
        System.out.println("LINHAS " + linhas);
        System.out.println("COLUNAS " + colunas);
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna <= colunas; coluna++) {
                
                if (coluna - linha > meio) {
                    System.out.print("   ");
                } else if (coluna + linha < meio) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                } 
            }
            System.out.println();
        }


        for (int linha = linhas -2; linha >= 0; linha--) {
            for (int coluna = colunas-1; coluna >= 0; coluna--) {
                
                if (coluna - linha > meio) {
                    System.out.print("   ");
                } else if (coluna + linha < meio) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                } 
            }
            System.out.println();
        }
        
    }
}
