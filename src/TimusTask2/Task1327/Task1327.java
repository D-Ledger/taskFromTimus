package TimusTask2.Task1327;

import java.util.Scanner;

public class Task1327 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int result = ((b - a) >> 1);
        if ((a & 1) > 0 || (b & 1) > 0) {
            result++;
        }
        System.out.println(result);
        in.close();
    }
}
