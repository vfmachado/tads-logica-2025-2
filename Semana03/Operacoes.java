package Semana03;

public class Operacoes {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;

        int soma, sub, mult, divisao;
        
        soma = a + b;
        sub = a - b;
        mult = a * b;
        divisao = a / b;    // se eu divido 2 inteiros, o resultado é inteiro
        
        System.out.println("SOMA " + soma);
        System.out.println("SUB " + sub);
        System.out.println("MULT " + mult);
        System.out.println("DIVISAO " + divisao);

        // primeiro faz a conversao para real  (real / inteiro)
        float divR = (float) a / b;
        System.out.println("DIV REAL " + divR);

        // 5 / 3 = 1        e os outros 2?
        // a / b  = resultado    resto     a -  resultado * b 
        //                                  5 - 1 * 3 = 2

        // 19 / 4    4 resto 3
        // 19 - 4 * 4 = 19 - 16 = 3
        int resto = a % b;  // resto da divisao de a por b
        System.out.println("RESTO  5 % 3 = " + resto);
    }
}
