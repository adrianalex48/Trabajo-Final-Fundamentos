public class MenorEnArreglo {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 23, 4, 42, 16};
        int menor = numeros[0]; // Asumimos que el primero es el menor

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i]; // Actualizamos si encontramos uno más pequeño
            }
        }

        System.out.println("El número menor del arreglo es: " + menor);
    }
}