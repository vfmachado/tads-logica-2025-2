public class SemZero {
    public static void main(String[] args) {
        
        int [] v = { 0, 0, 10, 0, 20, 0, 30, 40, 0, 0};

        int contZeros = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) contZeros++;
        }
        int novoTamanho = v.length - contZeros;
        int [] v2 = new int[novoTamanho];

        int pos2 = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                v2[pos2] = v[i];
                pos2++;
            }
        }

        v = v2;
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }
}
