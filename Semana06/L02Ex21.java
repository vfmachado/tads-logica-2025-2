import java.util.Scanner;

public class L02Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // variaveis
        float comprimento, consumoKmL;
        int numeroVoltas, qtdReabastecimento;

        float litrosPorReab;

        // entrada
        System.out.println("Informe compri, numero de voltas, qtdReab e consumo km/l");
        comprimento = in.nextFloat();
        numeroVoltas = in.nextInt();
        qtdReabastecimento = in.nextInt();
        consumoKmL = in.nextFloat();
       
        // processamento
        float distancia = comprimento * numeroVoltas / 1000;
        float distanceEntreAbas = distancia / qtdReabastecimento;

        // saida
        litrosPorReab = distanceEntreAbas / consumoKmL;
        System.out.println("LITROS NECESSARIOS A CADA REAB " + litrosPorReab);


    }
}
