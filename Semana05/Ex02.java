import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // variaveis
        int lados, medida, perimetro, area;

        // entrada
        System.out.println("Informe a quantidade de lados e a medida");
        lados = in.nextInt();
        medida = in.nextInt();

        // processamento e saida (sim, ficou misturado e tudo bems)
        if (lados == 3) {
            perimetro = 3 * medida;
            System.out.println("Triangulo de perimetro " + perimetro);
        } else if (lados == 4) {
            area = medida * medida;
            System.out.println("Quadrado de area " + area);
        } else if (lados == 5) {
            System.out.println("Pentagono");
        } else {
            System.out.println("Figura desconhecida");
        }

        // if (lados < 3 || lados > 5) {
        //     System.out.println("Figura desconhecida");
        // }
    }
}