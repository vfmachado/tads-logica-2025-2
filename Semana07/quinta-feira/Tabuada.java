public class Tabuada {
    public static void main(String[] args) {
        // faca um programa que dado um valor mostre a tabuada do 1 ao 10 deste valor

        int num = 8;
        int n = 1;
      
        while (n <= 100) {
            int mult = n * num;
            System.out.printf("%d x %d = %d\n", n, num, mult);
            n++;
        }

    }
}
