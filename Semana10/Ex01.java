public class Ex01 {
    
    public static void main(String[] args) {
        
        // final -> constante
        final int LINHAS = 6;
        final int COLUNAS = 6;

        // int a = 0;
        // int b = 5;

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                if (i == 0 || i == 5 || j == 0) {
                    System.out.print(" x ");
                // } else if (i == a && j == b) {
                } else if (i + j == 5) {
                    System.out.print(" x ");
                } else {
                    System.out.print(" - ");
                }
            
            }
            // a++;
            // b--;
            System.out.println();
        }


    }

}
