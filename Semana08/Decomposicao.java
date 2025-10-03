public class Decomposicao {
    public static void main(String[] args) {
        // DECOMPOR UM NUMERO EM FATORES PRIMOS
        // 90 =  2 * 3 * 3 * 5

        int valor = 120;
        int divisor = 2;
        while (valor > 1) {
            if (valor % divisor == 0) {
                System.out.println(divisor);
                valor = valor / divisor;
            } else {
                divisor++;
            }
        }
        

    }
}
