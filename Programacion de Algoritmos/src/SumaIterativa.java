public class SumaIterativa {
    public static void main(String[] args) {
        int n = 5; // Queremos sumar los primeros 5 enteros (1+2+3+4+5)
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma iterativa de los primeros " + n + " enteros es: " + suma);
    }
}