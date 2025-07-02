public class Fibonacci {
    // Iterative — O(n) time, O(1) space
    public static long fib(int n) {
        if (n <= 1) return n;
        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // Print series up to n terms
    public static void printSeries(int terms) {
        System.out.print("Fibonacci(" + terms + "): ");
        for (int i = 0; i < terms; i++) System.out.print(fib(i) + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        printSeries(10); // 0 1 1 2 3 5 8 13 21 34
    }
}
