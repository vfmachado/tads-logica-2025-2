import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int [] v = new int[10];   // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        int [] a, b, c; // todos sao vetores
        int d, e, f[];  // só f é vetor
        int opcao;

        do {
            System.out.println("\nEscolha a opcao (-1 para sair) ");
            System.out.println("1. Mostrar o vetor");
            System.out.println("2. Colocar valores no vetor");
            System.out.println("3. Mostrar o vetor na ordem inversa");
            System.out.println("4. Mostrar as posicoes e valores em que v[i] é par");
            System.out.println("5. Contar quantos valores sao multiplos de um valor escolhido pelo usuario");

            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    // mostrar o vetor
                    for (int i = 0; i < v.length; i++) {
                        // System.out.println(v[i]);
                        System.out.print("v[" + i + "] = " + v[i] + "  ");
                    }
                    System.out.println();
                    break;
                case 2:
                    // ler valores para o vetor
                    for (int i = 0; i < v.length; i++) {
                        // para cada posicao, vou ler o valor que aquela posicao recebe
                        System.out.print("Informe o valor para a posicao " + i + " = ");
                        v[i] = in.nextInt();        
                    }
                    break;
                case 4: 
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] % 2 == 0)
                            System.out.print("v[" + i + "] = " + v[i] + "  ");
                    }
                    System.out.println();
                    break;
                
                case 5:
                    System.out.println("ESCOLHA UM NUMERO");
                    int n = in.nextInt();
                    int multiplos = 0;
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] % n == 0)
                            multiplos++;
                    }
                    System.out.println("Quantidade de multiplos: " + multiplos);
                    break;
            }

        } while (opcao != -1);


    }
}
