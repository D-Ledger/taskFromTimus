package TimusTask2.Task1991;

import java.util.Scanner;

public class Task1991 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int boombooms = 0;
        int droids = 0;

        int n = in.nextInt();
        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int diff = k - a;
            if (diff > 0) {
                droids += diff;
            } else if (diff < 0) {
                boombooms += Math.abs(diff);
            }
        }
        System.out.println(boombooms + " " + droids);
        in.close();
    }
}
