public class Palindromo2 {
    public static void main(String[] args) {
        
       String palavra = "araraabara";
       // 10 letras
       // tamanho = 10
       // .length = 10
       // primeira posicao  0
       // ultima posicao    9  (10-1  => .length-1  )
        
       
        char [] letras = palavra.toCharArray(); // converte a string para uma sequencia de letras
    
        boolean palindromo = true;
        for (int i = 0; i < letras.length/2; i++) {
            if (letras[i] != letras[letras.length-1-i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) System.out.println("EH UM PALINDROMO");
        else System.out.println("NAO EH UM PALINDROMO");

    }
}
