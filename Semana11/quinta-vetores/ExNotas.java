import java.util.Scanner;

public class ExNotas {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float [] notas;
        int quantidade;
        System.out.println("Informe a quantidade de notas que serao digitadas");
        quantidade = in.nextInt();
        notas = new float[quantidade];  // podemos determinar em tempo de execução qual o tamanho do vetor =O
        
        // vetor.length é uma propriedade dos vetores que indica qual o tamanho do vetor.   LENGHT => TAMANHO
        for (int i = 0; i < notas.length; i++) {
        // for (int i = 0; i < quantidade; i++) {
            notas[i] = in.nextFloat();
            // a variavel notas na posicao i recebe o valor digitado
        }

        // agora vamos mostrar todas as notas digitadas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "] = "+ notas[i]);
            // i => posicao 
            // notas[i] => valor na posicao
        }

        // PROIBIDO FAZER ESTE TIPO DE COISA!!!
        // System.out.println("notas[0] = " + notas[0]);
        // System.out.println("notas[1] = " + notas[1]);
        // System.out.println("notas[2] = " + notas[2]);
        // System.out.println("notas[3] = " + notas[3]);
        // System.out.println("notas[4] = " + notas[4]);
        // System.out.println("notas[5] = " + notas[5]);
    }
}
