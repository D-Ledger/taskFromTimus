package TimusTask2.Task1110;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task1110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();

        List<Integer> results = new ArrayList<>();

        for (int x = 0; x < m; x++) {
            if (modPow(x, n, m) == y) {
                results.add(x);
            }
        }

        if (results.isEmpty()) {
            System.out.println("-1");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < results.size(); i++) {
                sb.append(results.get(i));
                if (i < results.size() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
        in.close();
    }

    private static int modPow(int base, int exponent, int modulus) {
        if (modulus == 1) return 0;
        long result = 1;
        long b = base % modulus;
        long exp = exponent;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * b) % modulus;
            }
            b = (b * b) % modulus;
            exp /= 2;
        }
        return (int) result;
    }
}
