public class NonRecursionFactorial {
    public static int factorial(int num) {
        int total = 1;
        for (int i = num; i > 0; i--) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}