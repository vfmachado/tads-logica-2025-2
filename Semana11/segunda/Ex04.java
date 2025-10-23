import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int mdc = 1;
        int mmc = 1;

        for (int i = 2; i <= a && i <= b && i <= c; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                mdc = i;
            }
        }

        System.out.println("MDC = " + mdc);

        int maior = a;
        if (b > a) maior = b;
        if (c > b) maior = c;

        for (mmc = maior ;    ; mmc++ ) {
            if (mmc % a == 0 && mmc % b == 0 && mmc % c == 0) {
                break;
            }
        }

        System.out.println("MMC = " + mmc);

    }
}
