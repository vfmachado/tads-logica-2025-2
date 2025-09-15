public class Printf {
    public static void main(String[] args) {
        
        String nome = "Vinicius";

        int inteiro = 10;
        float decimal  = 2.591231f;
        double a = 0.1, b = 0.2, c;
        c = a + b;

        System.out.println(c);

        // saida formatada

        System.out.printf("MINHA SAIDA... \n ");
        System.out.printf(" RESTO DA SAIDA\n");

        System.out.printf("O USUARIO %s BLA BLA BLA\n", nome );
        System.out.printf("MEU VALOR FLOAT %.2f\n", decimal);
        System.out.printf("VALOR DOUBLE COM 1 CASA %.1f\n", c);
    }
}
