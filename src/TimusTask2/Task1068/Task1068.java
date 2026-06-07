package TimusTask2.Task1068;

import java.util.Scanner;

public class Task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n > 10000 || n < -10000) {
            System.exit(0);
        }

        if (n >= 1) System.out.print(n *(n + 1) / 2);
        if (n < 1) System.out.print(-((-n) *(1 -n) / 2) + 1);

        in.close();
    }
}
