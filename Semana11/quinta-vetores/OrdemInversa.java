public class OrdemInversa {
    public static void main(String[] args) {
        
        // mostrar os valores na ordem inversa a leitura (ou posicao)

        // outra forma de declarar o vetor já com a inicialização
        int [] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // primeira posicao = 0  (tem o valor 10, vetor[0]) 
        // ultima posicao = 9    (tem o valor 100, vetor[9])

        // ultima posicao é sempre igual ao tamanho -1. logo vetor.length - 1

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        // nao funciona
        // int [] v2;
        // v2 = { 1, 2, 3, 4, 5, 6};



    }
}
