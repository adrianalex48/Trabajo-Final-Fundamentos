public class FactorialRecursivo {
    // FACTORIAL RECURSIVO
    static long factorial(long n) {
        if (n == 1 || n == 0) {
            return 1;
            //caso base ^^
        }
        return n * factorial(n - 1);
    }
    static void main() {
        long n = 10;
        System.out.println(factorial(n));
    }
}
