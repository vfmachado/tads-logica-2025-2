import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
       
        // resolve o problema 1x e depois faz repetir
        float popA, popB, txA, txB;

        // considera que a popB < popA
        // considera que txB > txA
        popA = in.nextFloat();
        txA = in.nextFloat();
        popB = in.nextFloat();
        txB = in.nextFloat();

        int anos = 0;
        // em quantos anos pobB > popA ?
        while (popB < popA) {

            popB = popB * (1 + txB/100);
            popA = popA * (1 + txA/100);
            anos++;

            System.out.println("ANO " + anos + " POP A " + popA + " / POP B " + popB);
        }
    }
}