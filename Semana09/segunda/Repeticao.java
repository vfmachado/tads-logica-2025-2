public class Repeticao {
    public static void main(String[] args) {
        
        // faca um programa que mostre os numeros de 1 a 10
        int i;

        i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        for (i = 1 ; i <= 10 ; i++) {
            System.out.println(i);
        }

        for (i = 20; i >= 0; i = i -2) {
            System.out.println(i);
        }

        for (i = 3; i < 100; i = i + 3) {
            System.out.println(i);
        }

        /* 
        // 3 ESTRUTURAS DE REPETICAO - BASICAS
        // WHILE
            ENQUANTO O VALOR LOGICO FOR VERDADEIRO - REPETE O BLOCO
            i = 0;
            WHILE (i <= 10) {
                i++;
            }
                    1       2       4
            FOR (i = 0 ; i <= 10 ; i++) {
                // bloco 3
            }

            FOR (INICIALIZACAO ;  VALOR_LOGICO ; PASSO ) {
                // BLOCO DE CODIGO
            }

            // NO FOR TODOS OS PARAMETROS SAO OPCIONAIS
            FOR ( ;  ; ) {
            }

        // terceira forma da respiracao da repeticao


        do {

        } while (valor_logico);

        // O DO WHILE GARANTE PELO MENOS 1 EXECUCAO DO BLOCO
        // PQ PRIMEIRO EXECUTA O BLOCO E DEPOIS TESTA
        
        */ 
    }
}
