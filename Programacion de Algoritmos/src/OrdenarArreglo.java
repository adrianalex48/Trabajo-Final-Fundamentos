public class OrdenarArreglo {
    public static void main(String[] args) {
        int[] arreglo = {15, 8, 23, 4, 42, 16};
        int n = arreglo.length;

        // Lógica de ordenamiento
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar valores
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }

        // Mostrar el arreglo ordenado
        System.out.print("Arreglo ordenado: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}