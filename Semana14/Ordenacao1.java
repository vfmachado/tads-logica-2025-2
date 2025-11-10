public class Ordenacao1 {
    public static void main(String[] args) {
        

        int [] v = {11, 7, 9, 4, 3, 5};


        for (int a = 0; a < v.length; a++) {
            for (int b = a + 1; b < v.length; b++) {
                
                if (v[b] < v[a]) {
                    System.out.println("Posicoes " + a + " e " + b);
                    int va = v[a];
                    int vb = v[b];
                    v[a] = vb;
                    v[b] = va;

                    for (int i = 0; i < v.length; i++) {
                        System.out.print(v[i] + " ");
                    }
                    System.out.println();
                }

            }
        }
        


    }
}
