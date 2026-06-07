package TimusTask2.Task1263;

import java.util.Scanner;

public class Task1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        if(0 >= N || N >= 10001) {
            System.exit(1);
        }

        int M = in.nextInt();
        if(0 >= M || M >= 10001) {
            System.exit(1);
        }

        int[] iVotes = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int iCandidate = in.nextInt();
            iVotes[iCandidate]++;
        }

        for (int i = 1; i <= N; i++) {
            double iPercentage = (double) iVotes[i] / M * 100;
            System.out.printf("%.2f%%\n", iPercentage);
        }
        in.close();
    }
}
