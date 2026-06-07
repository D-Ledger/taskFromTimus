package TimusTask2.Task1108;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1108 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();

            BigInteger current = BigInteger.valueOf(2);

            for (int i = 0; i < n; i++) {
                System.out.println(current);

                BigInteger next = current.multiply(current.subtract(BigInteger.ONE)).add(BigInteger.ONE);
                current = next;
            }
        }
        in.close();
    }
}
