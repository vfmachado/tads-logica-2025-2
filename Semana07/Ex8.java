import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);


        float renda = in.nextFloat();
        float imposto;

        if (renda < 2000) {
            imposto = 0;
        } else if (renda < 3000) {
            imposto = (renda - 2000) * 0.08f;
        } else if (renda < 4500) {
            imposto = (renda - 3000) * 0.18f + 80;
        } else {
            imposto = (renda - 4500) * 0.28f + 80 + 270;
        }
        
        System.out.println("IMPOSTO TOTAL " + imposto);

    }
}
