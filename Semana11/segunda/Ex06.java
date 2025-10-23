import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int fatorial = 1;
        float divisao;
        float soma = 1;
        float potencia = 1;
        for (int i = 1; i < 10; i++) {
            potencia = potencia * x;
            fatorial = fatorial * i;
            divisao = potencia / fatorial;
            soma = soma + divisao;
            
        }

        System.out.println(soma);
    }
}
