import java.util.Scanner;

public class CaixasPiso {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        /*
            O FULANO QUERIA COLOCAR PISO NOVO EM SUA SALA...
            faça um programa que dado as dimensoes de uma sala (comprimento e largura) e a quantidade de m2 em cada caixa de piso, determine quantas caixas devem ser compradas. Considere a adição de 10% da area total para considerar possíveis quebras e recortes.
        */

       
        /*
        tipos
            int
            double
            float
            bolean
            char
            String  (tem S maiusculo)
            byte / short / long / BigDecimal (tem B maiusculo)

            TIPOS PRIMITIVOS COM LETRA minuscula
            TIPOS NAO PRIMITIVOS SAO CLASSES, LOGO LETRA MAISUCULA
         */
        // TIPO NOME  (caixinha nomeada)
  
        // ENTRADA
        // variaveis do programa / app
        float comprimento, largura, area, totalCaixas, m2;
        
        System.out.println("Informe as dimensoes do comodo");
        comprimento = in.nextFloat();
        largura = in.nextFloat();

        System.out.println("Quantos m2 cada caixa cobre");
        m2 = in.nextFloat();

        // PROCESSAMENTO
        area = comprimento * largura;
        totalCaixas = area * 1.1f / m2;

        // SAIDA
        System.out.println("AREA DO COMODO " + area);
        System.out.println("TOTAL DE CAIXAS NECESSARIAS "  + totalCaixas);

        in.close();
    }

}
