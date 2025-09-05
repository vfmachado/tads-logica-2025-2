import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // faca um programa que dado a idade de uma pessoa, indique a categoria
        // menor de idade < 18
        // melhor idade >= 60
        // adulto entre 18 e 59

        int idade = in.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        }

        if (idade >= 60) {
            System.out.println("Melhor idade");
        }

        // && => RETORNA VERDADEIRO QUANDO AMBAS AS CONDICOES (VALORES LOGICOS) SAO VERDADEIROS.
        if (idade >= 18 && idade < 60) {
            System.out.println("Adulto");
        }
    }    
}
