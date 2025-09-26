import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int valor, n100, n50, n20, n10, n5 = 0, n2;

        System.out.println("informe o valor");
        valor = in.nextInt();

        if (valor % 2 == 1) {
            n5 = 1;
        }
        
        n100 = valor / 100;
        valor = valor % 100;

        n50 = valor / 50;
        valor = valor % 50;

        n20 = valor / 20;
        valor = valor % 20;

        n10 = valor / 10;
        valor = valor % 10;

        n2 = valor / 2;
        
        System.out.println("100 x " + n100);
        System.out.println("50 x " + n50);
        System.out.println("20 x " + n20);
        System.out.println("10 x " + n10);
        System.out.println("5 x " + n5);
        System.out.println("2 x " + n2);

    }
}
