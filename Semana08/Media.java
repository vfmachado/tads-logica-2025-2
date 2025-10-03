import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float soma = 0; 
        int cont = 0;
        while (cont < 5) {
            float nota = in.nextFloat();
            soma = soma + nota;
            cont++;
        }

        float media = soma / 5;
        System.out.println(media);
    }
}
