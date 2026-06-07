package TimusTask2.Task1079;

import java.util.Scanner;

public class Task1079 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maxN = 99999;
        int[] a = new int[maxN + 1];
        int[] maxFromStart = new int[maxN + 1];

        a[0] = 0;
        a[1] = 1;
        maxFromStart[0] = 0;
        maxFromStart[1] = 1;

        for (int i = 1; i <= maxN / 2; i++) {
            if (2 * i <= maxN) {
                a[2 * i] = a[i];
            }
            if (2 * i + 1 <= maxN) {
                a[2 * i + 1] = a[i] + a[i + 1];
            }
        }

        for (int i = 2; i <= maxN; i++) {
            maxFromStart[i] = Math.max(maxFromStart[i - 1], a[i]);
        }

        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(maxFromStart[n]);
        }
        in.close();
    }
}
