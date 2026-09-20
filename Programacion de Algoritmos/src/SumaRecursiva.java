public class SumaRecursiva {

    // Método que se llama a sí mismo
    public static int sumar(int n) {
        if (n <= 0) {
            return 0; // Caso base para detener la recursividad
        }
        return n + sumar(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Queremos sumar los primeros 5 enteros

        int resultado = sumar(n);
        System.out.println("La suma recursiva de los primeros " + n + " enteros es: " + resultado);
    }
}