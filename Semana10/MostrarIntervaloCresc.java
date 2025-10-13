public class MostrarIntervaloCresc {
    public static void main(String[] args) {
        

        // dados dois numeros quaisquer A > B ou B > A
        // mostrar em ordem crescente

        int a = 5;
        int b = 10;

        int menor, maior;
        if (a <= b) {
            menor = a;
            maior = b;
        } else {
            menor = b;
            maior = a;
        }

        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }

    }
}
