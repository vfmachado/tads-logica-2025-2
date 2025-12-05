import java.util.Random;

public class L11Ex08 {

    public static void main(String[] args) {
        
        int TAM = 4;
        int [][] m = new int[TAM][TAM];

        // for (int i = 0; i < m.length; i++) {
        //     for (int j = 0; j < m[i].length; j++) {
        //         System.out.print(m[i][j] + "  ");
        //     }
        //     System.out.println();
        // }
        Utilidade.mostraMatriz(m);

        Random aleatorio = new Random();
        for (int i = 0; i < m.length * m.length; i++) {
            m[i/TAM][i%TAM] = aleatorio.nextInt(10);
        }

        Utilidade.mostraMatriz(m);

        int trocas = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                // diagonal principal
                if (i == j && m[i][j] != 5) {
                    m[i][j] = 5;
                    trocas++;
                }
            }
        }
        Utilidade.mostraMatriz(m);
        System.out.println("TROCAS " + trocas);

        int somaDP = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                somaDP = somaDP + m[i][j];
            }
        }

        System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAG PRINC  " + somaDP);

        // 9. Calcule a soma dos elementos que estao abaixo da diagonal principal.
        // 10. Calcule a soma dos elementos que estao na diagonal principal.
        // 11. Calcule a soma dos elementos que estao na diagonal secundaria.
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                 if () {

                 }
            }
        }
        // 12. Calcule e imprima a sua transposta.
    }
}
