import java.util.Scanner;

public class L03Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final String codigo = "1234";
        final String senha = "9999";

        String entradaCodigo, entradaSenha, saida;

        // validar o usuario 1234
        System.out.println("Informe o codigo de usuario");
        entradaCodigo = in.next();

        if (entradaCodigo.equals(codigo)) {
            System.out.println("Informe a senha");
            entradaSenha = in.next();

            if (entradaSenha.equals(senha)) {
                saida = "Acesso permitido";
            } else {
                saida = "Acesso negado";
            }
        } else {
            saida = "Usuario invalido";
        }

        System.out.println(saida);
        
    }
}
