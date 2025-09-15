import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // var entrada
        int notaMenor, notaMeio, notaMaior, valor;
        
        // var saida
        int qtdMenor, qtdMeio, qtdMaior;

        // entrada
        System.out.println("Informe as notas disponiveis em ordem cresc");
        notaMenor = in.nextInt();
        notaMeio = in.nextInt();
        notaMaior = in.nextInt();

        System.out.println("Valor que deseja sacar?");
        valor = in.nextInt();

        // processamento
        qtdMaior = valor / notaMaior;
        valor = valor % notaMaior;

        qtdMeio = valor / notaMeio;
        valor = valor % notaMeio;

        qtdMenor = valor / notaMenor;

        // saida
        System.out.println(qtdMenor + "x " + notaMenor);
        System.out.println(qtdMeio + "x " + notaMeio);
        System.out.println(qtdMaior + "x " + notaMaior);


    }
}
