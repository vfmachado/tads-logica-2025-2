import java.util.Scanner;

// O NOME DO ARQUIVO COMBINA COM O NOME DA CLASSE
// CAMELCASE
// NOMES DE ARQUIVOS (CLASSES) COMECAM COM LETRA MAIUSCULA
public class Tipos {
    public static void main(String[] args) {

        // INTERACAO COM O USUARIO
        // INSTANCIAR
        // DECLARAR UMA VARIAVEL DO TIPO SCANNER E INICIALIZACAO;
        Scanner in = new Scanner(System.in);

        System.out.println(Integer.MAX_VALUE);

        // TIPOS PRIMITIVOS EM JAVA UTILIZAM LETRAS MINUSCULAS
        // int float double boolean byte short long char
        // numeros inteiros, utilizamos o tipo int  (letra i minuscula)
        int valor = 10;

        // numeros ponto flutuante
        float a = 0.1f; // 8 casas após a virgula
        // ao declarar um numero float, precisamos indicar o f no final
        // caso contrario o java entende como double

        double muitaPrecisao = Math.PI;
        System.out.println(muitaPrecisao);

        // String é um tipo nao primitivo, serve para guardarmos texto
        String texto = "qualquer texto \n inclusive com quebra de linha.";
        

    }
}