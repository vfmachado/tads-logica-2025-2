public class Desenho11 {
    public static void main(String[] args) {
        
        // fazer um X de tamanho N
        int n = 10;
        int linha = 0;
        int coluna = 0;

        while (linha < n) {
            coluna = 0;
            while(coluna < n) {
                if (linha == coluna) {
                    System.out.print(" # ");
                } else if (linha + coluna == n-1){
                    System.out.print(" # ");
                } else {
                    System.out.print(" - ");
                }
                coluna++;
            }
            System.out.println();
            linha++;
        }
    }
}
