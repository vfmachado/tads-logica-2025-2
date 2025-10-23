import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);
        int [] canditados = new int[5];

        while (true) {
            // valor de 1 a 5
            // nesse exemplo o voto ta relacionado com a posicao
            // e a posicao é "o candidato(a)"
            int voto = in.nextInt();

            if (voto <= 0 || voto > 5) {
                break;
            }

            canditados[voto-1]++;

        }

        for (int i = 0; i < canditados.length; i++) {
            System.out.println("Candidato(a) " + (i+1) + " recebeu " + canditados[i] + " votos." );
        }
    }
}
