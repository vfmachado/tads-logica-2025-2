public class SomaEntre {
    public static void main(String[] args) {
        
        // calcular a soma dos numeros entre um intervalo x y    
        int x = 10;
        int y = 20;
        int soma = 0;

        while (x <= y) {
            soma = soma + x;
            System.out.println("Somando " + x + " SOMA PARCIAL " + soma);
            x++;    // x = x + 1;
        }

        System.out.println("SOMA: " + soma);
        
    }
}
