public class JuntaOrdenado {
    public static void main(String[] args) {
        
        int [] x = { 1, 1, 1, 3, 5, 6, 10, 10, 10 };
        int [] y = { 1, 1, 1, 2, 4, 8, 9};
        // z = { 1, 1, 2, 3, 4, 5, 6, 8, 9}

        int [] z = new int[x.length + y.length];

        int i = 0;
        int j = 0;

        for (int n = 0; n < z.length; n++) {
            
            if (i == x.length) {
                z[n] = y[j];
                j++;
                continue;
            }

            if (j == y.length) {
                z[n] = x[i];
                i++;
                continue;
            }

            if (x[i] < y[j]) {
                z[n] = x[i];
                i++;
            } else {
                z[n] = y[j];
                j++;
            }
        }

        for (int n = 0; n < z.length; n++) {
            System.out.println(z[n]);
        }
    }
}
