public class Utilidade {

    public static void mostraVetor(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            // System.out.printf("v[%d] = %d  ", i, v[i]);
            System.out.print(v[i]);
            if (i < v.length-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void mostraMatriz(int[][] m) {
        System.out.println("\n === MATRIZ ===");
        for (int i = 0; i < m.length; i++) {
            mostraVetor(m[i]);
        }
    }
}
