package TimusTask2.Task1654;

import java.util.Scanner;

public class Task1654 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
        in.close();
    }
}
