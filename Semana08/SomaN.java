public class SomaN {
    public static void main(String[] args) {
        int n = 10;
        int soma = 0;
        int contador = 2;
        while (contador <= n) {
            soma = soma + contador;
            contador = contador +2;
        }
        System.out.println(soma);
    }
}
