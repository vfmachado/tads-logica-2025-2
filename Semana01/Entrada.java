import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // declaracao de variavel
        String palavra;

        System.out.println("Digite uma palavra");
        // atribuir um valor a variavel que o usuario digitou
        palavra = in.next();
        
        // concatenar um texto com o valor da variavel
        System.out.println("A palavra que vc digitou foi " + palavra);


        int a, b, soma;
        System.out.println("Informe 2 numeros");
        a = in.nextInt(); 
        b = in.nextInt();

        // somem os dois e mostrem o resultado =)
        soma = a + b;
        System.out.println("A soma foi " + soma);
    }
}