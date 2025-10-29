import java.util.Scanner;

public class VetoresMostrar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v = new int[5];
         // posicoes de 0 a 4   , tamanho = 5
        System.out.println("TAMANHO  = " + v.length);

        v[0] = 123;
        v[1] = 531;
        v[2] = 514;
        v[3] = 321;
        v[4] = 777;
        // v[5] = 999; // nao pode, nao cabe, o vetor tem tamanho 5, logo posicoes de 0 a 4

        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();    
        }

        for (int i = v.length -1; i >= 0; i--) {
            System.out.println(v[i]);
        }
    }    
}
