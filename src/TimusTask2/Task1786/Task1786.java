package TimusTask2.Task1786;

import java.util.Scanner;

public class Task1786 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine().trim();

        String target = "Sandro";
        int targetLen = target.length();
        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i <= text.length() - targetLen; i++) {
            int currentCost = 0;

            for (int j = 0; j < targetLen; j++) {
                char sourceChar = text.charAt(i + j);
                char targetChar = target.charAt(j);

                if (sourceChar != targetChar) {
                    boolean isSourceUpper = Character.isUpperCase(sourceChar);
                    boolean isTargetUpper = Character.isUpperCase(targetChar);

                    if (isSourceUpper == isTargetUpper) {
                        currentCost += 5;
                    } else {
                        if (Character.toLowerCase(sourceChar) == Character.toLowerCase(targetChar)) {
                            currentCost += 5;
                        } else {
                            currentCost += 10;
                        }
                    }
                }
            }
            if (currentCost < minCost) {
                minCost = currentCost;
            }
        }
        System.out.println(minCost);
    }
}
