import java.util.Scanner;

public class Nextline {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String texto;
        int idade;
        String nome;

        System.out.println("Informe a idade e o nome completo");
        idade = in.nextInt();
        in.nextLine();   // limpar o enter do nextInt
        nome = in.nextLine();

        System.out.println(nome + " tem " + idade + " anos");

    }
}
