public class Piramide {
    public static void main(String[] args) {
        
        
        final int LINHAS = 10;
        
        // int comeca = 1;
        // for (int i = 0; i < LINHAS; i++) {
        //     comeca = comeca + 2;
        // }
        final int COLUNAS = LINHAS * 2 -1;

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (j <= COLUNAS/2 + i && j >= COLUNAS/2 - i) {
                    System.out.print(" M ");
                } else 
                    System.out.print("   ");
                
            }

            System.out.println();
        }
    }
}
