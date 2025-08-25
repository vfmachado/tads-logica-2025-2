package Semana03;

public class ExConversao {
    
    public static void main(String[] args) {
        
        // float - numero ponto flutuante
        float numeroReal = 1.5f;
        String cpf = "12312312312";
        int valorInteiro = -5;
        
        numeroReal = valorInteiro;
        valorInteiro = (int) numeroReal;
        //              ^ cast

        // curiosidade letra A = 65, a = 97
        char letra = 66;
        System.out.println("MINHA LETRA " + letra);

    }

}
