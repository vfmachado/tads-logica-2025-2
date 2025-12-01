import java.util.Scanner;

public class Matrizes2 {
    public static void main(String[] args) {
        
                                // [linhas][colunas]
        int [][] m = {
            {1, 2, 3, 4, 5, 6, 7},
            {2, 3, 4, 5, 6, 7, 8},
            {3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1},
        };
                            // TAM LINHA
        for (int i = 0; i < m.length; i++) {  // percorre linhas da matriz
                                // TAM DA COLUNA DA LINHA I
            for (int j = 0; j < m[i].length; j++) { // percorre as colunas de cada linha
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        System.out.println("escolha uma linha");
        int linha = in.nextInt();

        System.out.println("informe os elementos da linha " + linha);
        for (int j = 0; j < m[linha].length; j++) {
            m[linha][j] = in.nextInt();
        }

        System.out.println("\n ======== ");
        for (int i = 0; i < m.length; i++) {  // percorre linhas da matriz
            // TAM DA COLUNA DA LINHA I
            for (int j = 0; j < m[i].length; j++) { // percorre as colunas de cada linha
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int coluna = in.nextInt();
        for (int i = 0; i < m.length; i++) {
            if (i != linha) {
                m[i][coluna] = in.nextInt();
            }
        }

        System.out.println("\n ======== ");
        for (int i = 0; i < m.length; i++) {  // percorre linhas da matriz
            // TAM DA COLUNA DA LINHA I
            for (int j = 0; j < m[i].length; j++) { // percorre as colunas de cada linha
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
