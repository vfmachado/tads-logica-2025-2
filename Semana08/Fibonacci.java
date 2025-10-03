// 2. fazer um programa que mostre os 20 primeiros elementos da sequencia de fibonacci
//   1 1 2 3 5 8 13 ...
//         ^ 1 + 2
public class Fibonacci {
    public static void main(String[] args) {
        
        int a, b, c;

        a = 1;
        b = 1;
        System.out.print(a + " " + b);

        int cont = 0;
        while (cont < 18) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(" " + c);
            cont++;
        }

    }
}
