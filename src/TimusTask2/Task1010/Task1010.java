package TimusTask2.Task1010;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Task1010 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) return;
        tokenizer = new StringTokenizer(line);
        int n = Integer.parseInt(tokenizer.nextToken());

        long maxDiff = -1;
        int bestIndex = 1;

        line = reader.readLine();
        if (line == null) return;
        tokenizer = new StringTokenizer(line);
        long prevValue = Long.parseLong(tokenizer.nextToken());

        for (int i = 2; i <= n; i++) {
            line = reader.readLine();
            if (line == null) break;
            tokenizer = new StringTokenizer(line);
            long currentValue = Long.parseLong(tokenizer.nextToken());

            long currentDiff = Math.abs(currentValue - prevValue);

            if (currentDiff > maxDiff) {
                maxDiff = currentDiff;
                bestIndex = i - 1;
            }
            prevValue = currentValue;
        }
        System.out.println(bestIndex + " " + (bestIndex + 1));
    }
}
