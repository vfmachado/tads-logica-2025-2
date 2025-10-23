public class Palindromo {
    public static void main(String[] args) {
        
        // DEFINICAO PALINDROMO - é uma sequencia que é igual nas duas ordens de leitura
        // por exemplo      ama
        //    babab
        //     123454321
        //     arara

        // STRINGS SAO VETORES DE LETRAS
        String palavra = "araraabara";
        
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }

        char [] letras = palavra.toCharArray(); // converte a string para uma sequencia de letras
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        /*
            A   R   A   R   A   R   A
            0   1   2   3   4   5   6
            
            [0] == [6]
            [1] == [5]
            [2] == [4]
            [3] == [3] ? faz sentido? 
            [4] == [2] ? ja foi feito!!!  
         */

       
        boolean palindromo = true;
        for (int i = 0; i < letras.length/2; i++) {
            // letras.length -1  => ultima posicao
            //  i = 0       6 - 0 = 6
            //  i = 1       6 - 1 = 5      
            //  i = 2       6 - 2 = 4 
            System.out.println(i + " com " + (letras.length-1-i));
            char frente = letras[i];
            char atras = letras[letras.length-1-i];
            if (frente == atras) {
            //if (letras[i] == letras[letras.length-1-i]) {
                System.out.println("EH IGUAL");
            } else {
                System.out.println("DIFERENTE");
                palindromo = false;
                break;  // no primeiro grupo de letras diferentes, eu nao preciso mais comparar
            }
        }

        if (palindromo) System.out.println("EH UM PALINDROMO");
        else System.out.println("NAO EH UM PALINDROMO");

    }
}
