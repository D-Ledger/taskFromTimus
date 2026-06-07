package TimusTask2.Task1910;

import java.util.Scanner;

public class Task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int maxamount = 0;
        int position = 0;

        for (int i = 0; i < n - 2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > maxamount) {
                maxamount = sum;
                position = i + 2;
            }
        }
        System.out.print(maxamount + " " + position);
        in.close();
    }
}
