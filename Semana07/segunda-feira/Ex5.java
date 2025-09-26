import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int horaInicio, minutoInicio, horaFim, minutoFim;

        System.out.println("hora inicial, minuto incial, hora final, minuto final");
        horaInicio = in.nextInt();
        minutoInicio = in.nextInt();
        horaFim = in.nextInt();
        minutoFim = in.nextInt();

        int tempoPermanencia = horaFim * 60 + minutoFim  - (horaInicio * 60 + minutoInicio);

        if (tempoPermanencia <= 15) {
            System.out.println("GRATUITO");
        } else if (tempoPermanencia <= 60) {
            System.out.println("R$ 5,00");
        } else if (tempoPermanencia <= 180) {
            System.out.println("R$ 10,00");
        } else {

            int tempoExtra = tempoPermanencia - 180;
            int tempoExtraHoras = tempoExtra/60;

            if (tempoExtraHoras * 60 < tempoExtra) {
                tempoExtraHoras = tempoExtraHoras + 1;
            }

            int valor = 10 + 2 * tempoExtraHoras;
            System.out.println("VALOR FINAL " + valor);

        }
    }
}
