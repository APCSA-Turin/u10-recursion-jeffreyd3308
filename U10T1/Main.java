public class Main {
    public static void main(String[] args) {
        int n = 40;
        long startTime = System.nanoTime();
        int fibRec = fibonacci(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = iterativeFib(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " +fibonacci(n)+ " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " +iterativeFib(n)+ " | Time: " + iterativeTime / 1e6 + " ms");

    }

    private static int fibonacci(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static int iterativeFib(int n) {
        int prev1 = 0;
        int prev2 = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;
        }
        
        return sum;
    }
}