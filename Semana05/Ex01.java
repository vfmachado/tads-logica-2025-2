import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // variaveis
        float largura, comprimento, altura, area;
        int totalCxs;

        // entrada
        System.out.println("Informe comprimento, largura e altura");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        altura = in.nextFloat();
        
        // processamento
        area = 2 * comprimento * altura + 2 * largura * altura;
        totalCxs = (int) (area / 1.5f + 0.999999f);

        // saida
        System.out.println("Total de caixas: " + totalCxs);

    }
}