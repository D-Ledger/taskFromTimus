package TimusTask2.Task1014;

import java.util.Scanner;

public class Task1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n == 0) {
            System.out.println(10);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 9; i >= 2; i--) {
            while (n % i == 0) {
                result.append(i);
                n /= i;
            }
        }

        if (n > 1) {
            System.out.println(-1);
        } else {
            System.out.println(result.reverse().toString());
        }
        in.close();
    }
}
