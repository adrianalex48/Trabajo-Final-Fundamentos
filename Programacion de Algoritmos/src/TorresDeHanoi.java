// implementar el problema de las torres de hanoi de forma recursiva

public class TorresDeHanoi {

    public static void hanoi(int n, char A, char C, char B) {
        if (n == 1) {
            System.out.println("Disco " + n + " movido de: " + A + " -> " + C);
            return;
        }
        hanoi(n - 1, A, B, C);
        System.out.println("Disco " + n + " movido de: " + A + " -> " + C);
        hanoi(n - 1, B, C, A);
    }

    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }
}
