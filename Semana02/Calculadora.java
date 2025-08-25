import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // faça um programa que receba dois valores do tipo float e calcule as 4 operacoes matematicas basicas mostrando os resultados.

        // ENTRADA
        Scanner in = new Scanner(System.in);
        float a, b, soma;
        System.out.println("Informe os 2 valores");
        a = in.nextFloat();
        b = in.nextFloat();

        // PROCESSAMENTO
        soma = a + b;

        //SAIDA
        System.out.println("SOMA " + a + " + " + b + " = " + soma);
    }
}