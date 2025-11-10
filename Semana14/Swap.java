import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        while (true) {
            System.out.println("ESCOLHA DUAS POSICOES");
            int a = in.nextInt();
            int b = in.nextInt();
            // troque os valores das posicoes 'a' e 'b' 

            // lembre-se que posicao != valor
            
            // 3. adicione um if para validar as posicoes antes de fazer a troca
            // 3.1 caso a posicao seja invalida, pare o laço while(true)
            if (a < 0 || a >= v.length || b < 0 || b >= v.length) {
                System.out.println("ALGUMA POSICAO INVALIDA. FINALIZANDO");
                break;
            }

            // 1. verifique os valores escolhidos (pode ser um print)
            System.out.println(v[a] + " e " + v[b]);

            // 2. troque o valor das variaveis (v[a] e v[b])
            int va = v[a];
            int vb = v[b];
            v[a] = vb;
            v[b] = va;

            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + " ");
            }
            System.out.println();
        }
    }
}
