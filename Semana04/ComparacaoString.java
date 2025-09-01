import java.util.Scanner;

public class ComparacaoString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "123";
        String b = "123";

        // STRINGS SAO CLASSES
        // == UTILIZAMOS APENAS PARA TIPOS PRIMITIVOS
        // NESTE CASO O JAVA COMPARARIA A REFERENCIA DO OBJETO A E OBJETO B
        boolean teste1 = a == b;
        System.out.println(teste1);

        // STRING.EQUALS(OUTRA)  RETORNA VERDADEIRO / FALSO
        boolean teste2 = a.equals(b);   // forma correta
        System.out.println(teste2);

        System.out.println("VOCE DESEJA VER O MENU?");
        String opcao = in.next();

        if (opcao.equals("SIM")) {
            System.out.println("MENU:\n\t1. Pizza\n\t2. Lanche\n\t3. Churrasco\n\t4. Comida \n\t5. Sushi");
        }


    }
}
