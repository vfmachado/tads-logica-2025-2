package Semana03;

import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        
        // VC QUER SACAR UM VALOR NUM CAIXA ELETRONICO
        // TEM NOTAS DISPONIVEIS DE 100, 50, 10
        // CONSIDERE QUE O INPUT DO USUARIO FAZ SENTIDO
        // INDIQUE QUANTAS NOTAS DE CADA O CAIXA ELETRONICO DEVE ENTREGAR
        // EXEMPLO
        /*
            PEDI PARA SACAR 280 REAIS
            2 DE 100
            1 DE 50
            3 DE 10
         */

        Scanner in;
        in = new Scanner(System.in);

        int valor, n100, n50, n10;

        System.out.println("Informe quanto deseja sacar?");
        valor = in.nextInt();

        // processamento
        n100 = valor/100;
        int falta = valor % 100;

        // n50 = (valor % 100 ) / 50;
        n50 = falta / 50;

        n10 = (falta % 50) / 10;

        // saida
        System.out.println(n100 +  " x 100");
        System.out.println(n50 +  " x 50");
        System.out.println(n10 + " x 10");

        in.close();
    }
}
