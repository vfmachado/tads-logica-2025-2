import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
       
        int qtd = in.nextInt();
        int valor, anterior;
        valor = in.nextInt();
        int queda = 0;

        while (qtd-1 > 0) {
            anterior = valor;
            valor = in.nextInt();
            if (valor < anterior) {
                queda++;
            }
            qtd--;
        }
        System.out.println("Numero de quedas: " + queda);
       
        
    }
}