import java.util.Arrays;
public class FibonacciRecursivoDinamico {
        // CON PROGRAMACIÓN DINÁMICA
        static int fibonacci(int n, int fibonacci[]) {
            if (n == 1 || n == 0) {
                return n;
                //caso base
            } else {
                if (fibonacci[n] != -1)
                    return fibonacci[n];
                else
                    fibonacci[n] = fibonacci(n-1, fibonacci) + fibonacci(n-2, fibonacci);
                return fibonacci[n];
            }
        }
    static void main() {
            int n = 5 ;
            int fibonacci[] = new int[n + 1];
            Arrays.fill(fibonacci, -1);
            System.out.println(fibonacci(n, fibonacci));
    }
}
