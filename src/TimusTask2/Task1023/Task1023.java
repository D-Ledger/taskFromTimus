package TimusTask2.Task1023;

import java.util.Scanner;

public class Task1023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextLong()) {
            long k = in.nextLong();
            long minDivisor = -1;

            for (long d = 3; d * d <= k; d++) {
                if (k % d == 0) {
                    minDivisor = d;
                    break;
                }
            }

            if (minDivisor == -1 && k % 2 == 0 && k / 2 >= 3) {
                minDivisor = k / 2;
            }

            if (minDivisor == -1 && k >= 3) {
                minDivisor = k;
            }

            if (minDivisor != -1) {
                System.out.println(minDivisor - 1);
            } else {
                System.out.println(0);
            }
        }
        in.close();
    }
}
