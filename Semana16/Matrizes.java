public class Matrizes {
    public static void main(String[] args) {
        
                                // [linhas][colunas]
        int [][] m = new int[5][4];
        for (int i = 0; i < m.length; i++) {
            m[i][0] = 10 + i*10;
            m[i][1] = 11 + i*10;
            m[i][2] = 12 + i*10;
            m[i][3] = 13 + i*10;
        }   
        for (int i = 0; i < m.length; i++) {  // percorre linhas da matriz
            for (int j = 0; j < m[i].length; j++) { // percorre as colunas de cada linha
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

         /*
            m.length -> quantidade de linhas
            m[i].length -> quantidade de coluna da linha i
        */

    }
}
