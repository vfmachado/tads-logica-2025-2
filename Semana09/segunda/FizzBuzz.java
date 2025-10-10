public class FizzBuzz {
    public static void main(String[] args) {
        
        // faca um programa que mostre os numeros 1 a 100
        // MAS quando o numero for
        // multiplo de 3 mostre a palavra Fizz
        // multipli de 5 mostre a palavra Buzz
        // multiplo de 3 e 5, mostre a palavra FizzBuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
