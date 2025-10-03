import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        // dado dois numeros, encontrar o maximo divisor comum;

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int maior = 1;
        int div = 2;
        while (div <= a && div <= b) {
            if (a % div == 0 && b % div == 0) {
                maior = div;
            }
            div++;
        }
        System.out.println("MDC = " + maior);
        
    }
}
