public class Ex06 {
    public static void main(String[] args) {
        
        int n = 123456789;
        int invertido = 0;  //987654321

        int digito;

        while (n > 0) {
            digito = n % 10; // extrai o ultimo digito
            System.out.println("DIGITO " + digito);
            n = n / 10; // corta o ultimo digito de N
            System.out.println("NUMERO SEM DIGITO " + n);
            invertido = invertido * 10  + digito;
            System.out.println("invertido " + invertido);
        }
        
    }
}
