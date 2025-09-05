import java.util.Scanner;

public class ComparacaoElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // faca um programa que dado a idade de uma pessoa, indique a categoria
        // menor de idade < 18
        // melhor idade >= 60
        // adulto entre 18 e 59

        int idade = in.nextInt();
        
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 60) {
            System.out.println("Melhor idade");
        } else {
            System.out.println("Adulto");
        }
        
        // IMC = PESO / (ALTURA * ALTURA)
        // DADO O PESO E ALTURA DE UMA PESSOA, INDICAR A CLASSIFICADO DE ACORDO COM A TABELA DE IMC
        // imc      imc >= 18.5 && imc < 25
        /*  < 18.5  abaixo do pse
         *  >= 18.5  && < 25 normal
         *  >= 25  && < 30  excesso
         *  >= 30  obeso
         */
    }    
}
