package dynamic_programming;

public class FormN135 {

    // Given 3 numbers {1, 3, 5}, we need to tell
    // the total number of ways we can form a number 'N'
    // using the sum of the given three numbers.
    // (allowing repetitions and different arrangements).
    // E.g. Total number of ways to form 6 is: 8

    static int n = 6;
    static int[] memo = new int[n + 1];

    public static void main(String[] args) {
        for (int i = 0; i < memo.length; i++) memo[i] = -1;
        FormN135 formN135 = new FormN135();
        System.out.println(formN135.solve(n));
    }

    public int solve(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] != -1) return memo[n];
        else memo[n] = (solve(n - 1) + solve(n - 3) + solve(n - 5));
        return memo[n];
    }

}
