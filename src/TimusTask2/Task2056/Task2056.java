package TimusTask2.Task2056;

import java.util.Scanner;

public class Task2056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] vec = new int[n];
        int Threes = 0, Fours = 0, Fives = 0, v;
        float Sum = 0;

        for (int i = 0; i < n; i++) {
            vec[i] = in.nextInt();
            v = vec[i];
            Sum += v;
            if (v == 3) {
                Threes++;
            } else if (v == 4) {
                Fours++;
            } else if (v == 5) {
                Fives++;
            }
        }

        if (Threes > 0) {
            System.out.println("None");
        } else if (Fives == n) {
            System.out.println("Named");
        } else if (Sum / n >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
        in.close();
    }
}
