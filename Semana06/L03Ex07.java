import java.util.Scanner;

public class L03Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // variaveis
        String tipo; // char
                                // escolha 1 para G e 2 para A
    
        float litros;
        float valor = 0;

        // entrada
        System.out.println("Tipo de combustivel A / G e quantidade de litros");
        tipo = in.next();
        litros = in.nextFloat();

        // processamento
        // if (tipo == 'A')
        if (tipo.equals("A")) {
            System.out.println("ESCOLHEU ALCOOL");
            // logica do alcool
            if (litros <= 20) {
                valor = litros * 3.9f * 0.97f;  // litros * 3.9f * (1 - 0.03f)
            } else {
                valor = litros * 3.9f * 0.95f;
            }
        } else if (tipo.equals("G")) {
            System.out.println("ESCOLHEU GASOLINA");
            // logica da gasolina
            if (litros <= 20) {
                valor = litros * 4.3f * 0.96f;  // litros * 3.9f * (1 - 0.03f)
            } else {
                valor = litros * 4.3f * 0.94f;
            }
        } else {
            System.out.println("ENTRADA INVALIDA");
        }

        System.out.println("VALOR FINAL " + valor);
    }
}
