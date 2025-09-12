public class Ex04 {
    public static void main(String[] args) {
        
        int n = 1234;   // 4321

        int u, d, c, m;

        u = n % 10;     // 4
        d = (n / 10) % 10;   //   123 % 10 = 3        
        c = (n / 100) % 10;
        m = n / 1000;
        
        int invertido = u * 1000 + d * 100 + c * 10 + m;

        System.out.println("U = " + u);
        System.out.println("D = " + d);
        System.out.println("C = " + c);
        System.out.println("M = " + m);
        System.out.println("INVERTIDO " + invertido);
    }
}
