import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int h1, h2, m1, m2, homemNovo, homemVelho, mulherVelha, mulherNova;

        System.out.println("Informe 2 idades de homem e 2 idades de mulher");
        h1 = in.nextInt();
        h2 = in.nextInt();
        m1 = in.nextInt();
        m2 = in.nextInt();

        if (h1 > h2) {
            homemVelho = h1;
            homemNovo = h2;
        } else {
            homemVelho = h2;
            homemNovo = h1;
        }

        if (m1 > m2) {
            mulherVelha = m1;
            mulherNova = m2;
        } else {
            mulherVelha = m2;
            mulherNova = m1;
        }

        int somatorio = homemVelho + mulherNova;
        int produto = homemNovo * mulherVelha;

        System.out.println("Homem mais novo " + homemNovo);
        System.out.println("Homem mais velho " + homemVelho);
        System.out.println("Mulher mais nova " + mulherNova);
        System.out.println("Mulher mais velha " + mulherVelha);
        System.out.println("Somatorio " + somatorio);
        System.out.println("Produto " + produto);

        // if (h1 > h2 && m1 > m2) {

        // } else if (h1 > h2 && m2 > m1) {

        // } else if (h1 < h2 && m1 < m2) {

        // } else {

        // }

    }
}
