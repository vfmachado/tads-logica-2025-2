public class Ex13 {
    
    public static void main(String[] args) {
        
        // final -> constante
        final int LINHAS = 4;
        final int COLUNAS = 7;

        // int a = 0;
        // int b = 5;

        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                // linha par e coluna par
                if (i % 2 == 0 && j % 2 == 0)
                    System.out.print(" x ");
                // linha impar e coluna impar
                else if (i % 2 == 1 && j % 2 == 1)
                    System.out.print(" x ");
                // espacos em branco
                else
                    System.out.print("   ");
                
            }

            System.out.println();
        }


    }

}
