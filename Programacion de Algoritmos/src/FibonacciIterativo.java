public class FibonacciIterativo {
    //FIBONACCI ITERATIVO
    static long fibonacci(long n) {
        long a = 0;
        long b = 1;
        for (int i = 0; i < n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
    static void main() {
        long n = 20;
        System.out.println(fibonacci(n));
    }

}
