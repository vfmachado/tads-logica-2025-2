import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mes = in.nextInt();

        if (mes >= 1 && mes < 4) {
            System.out.println("Primeiro quartil");
        } else if (mes >= 4 && mes < 7) {
            System.out.println("Segundo quartil");
        } else if (mes >= 7 && mes < 10) {
            System.out.println("Terceiro quartil");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Quarto quartil");
        }
        
        switch (mes) {
            case 1:
            case 2:
            case 3:
                System.out.println("Primeiro Quartil");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Segundo Quartil");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Terceiro Quartil");
                break;
            
            case 10:
            case 11:
            case 12:
                System.out.println("Quarto Quartil");
                break;


            default:
                System.out.println("Mes invalido");
        }
    }
}
