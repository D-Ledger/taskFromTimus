package TimusTask2.Task1017;

import java.util.Scanner;

public class Task1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int k = 1; k <= n; k++) {
            for (int i = n; i >= k; i--) {
                dp[i] += dp[i - k];
            }
        }
        System.out.println(dp[n] - 1);
    }
}
