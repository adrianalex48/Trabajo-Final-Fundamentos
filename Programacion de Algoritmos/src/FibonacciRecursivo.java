public class FibonacciRecursivo {
    // SIN PROGRAMACIÓN DINÁMICA
    static long fibonacci(long n) {
        if (n == 1 || n == 0) {
            return n;
            //caso base
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    static void main() {
        long n = 20;
        System.out.println(fibonacci(n));
        }
    }
