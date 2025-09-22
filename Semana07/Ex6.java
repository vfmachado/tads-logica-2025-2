import java.util.Scanner;

public class Ex0 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float n1, n2, opt, media;
        System.out.println("informe notas e opt");
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        opt = in.nextFloat();

        if (opt == -1) {
            media = (n1 + n2)/2;
        } else {
            if (n1 < n2) {
                media = (n2 + opt)/2;
            } else {
                media = (n1 + opt)/2;
            }
        }

        if (media < 3) {
            System.out.println("REPROVADO");
        } else if (media < 6) {
            System.out.println("EXAME");
        } else {
            System.out.println("APROVADO");
        }
    }
}
