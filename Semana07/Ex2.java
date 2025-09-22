import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int min, max, qtd, media;

        System.out.println("informe a quantidade atual, min e max");
        qtd = in.nextInt();
        min = in.nextInt();
        max = in.nextInt();

        media = (min + max)/2;

        if (qtd < media) {
            System.out.println("EFETUAR COMPRA");
        } else {
            System.out.println("NAO EFETUAR COMPRA");
        }

    }
}
