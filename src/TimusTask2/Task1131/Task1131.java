package TimusTask2.Task1131;

import java.util.Scanner;

public class Task1131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long k = in.nextLong();

        if (n <= 1) {
            System.out.println(0);
            return;
        }

        long time = 0;
        long currentComputers = 1;

        while (currentComputers < k && currentComputers < n) {
            currentComputers *= 2;
            time++;
        }

        if (currentComputers < n) {
            long remaining = n - currentComputers;
            time += (remaining + k - 1) / k;
        }
        System.out.println(time);
        in.close();
    }
}
