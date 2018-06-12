package dynamic_programming;

public class Fibonacci {

    // F(1) = F(2) = 1
    // F(n) = F(n-1) + F(n-2)

    // Goal: Compute the nth Fibonacci number F(n).

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long start = System.currentTimeMillis();
        int n = fibonacci.fibNaive(25);
        long end = System.currentTimeMillis();
        System.out.println(n);
        System.out.println(end - start);

        start = System.currentTimeMillis();
        n = fibonacci.fibMemo(25);
        end = System.currentTimeMillis();
        System.out.println(n);
        System.out.println(end - start);

        start = System.currentTimeMillis();
        n = fibonacci.fibBottomUp(25);
        end = System.currentTimeMillis();
        System.out.println(n);
        System.out.println(end - start);

    }

    /**
     * Naive recursive algorithm
     * <p>
     * Time - O(2^n)
     */
    public int fibNaive(int n) {
        int f;
        if (n == 0 || n == 1) f = 1;
        else f = fibNaive(n - 1) + fibNaive(n - 2);
        return f;
    }

    /**
     * Memoized DP version of recursive algorithm
     * <p>
     * Time - O(n)
     */
    static int[] memo = new int[26];

    public int fibMemo(int n) {
        int f;
        if (n == 0 || n == 1) f = 1;
        else if (memo[n] != 0) f = memo[n];
        else {
            f = fibMemo(n - 1) + fibMemo(n - 2);
            memo[n] = f;
        }
        return f;
    }

    /**
     * Bottom-up DP version
     *
     * Time - O(n)
     */
    public int fibBottomUp(int n) {
        int[] fib = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int f;
            if (i == 0 || i == 1) f = 1;
            else f = fib[i - 1] + fib[i - 2];
            fib[i] = f;
        }
        return fib[n];
    }

}
