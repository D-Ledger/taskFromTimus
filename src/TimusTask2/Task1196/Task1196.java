package TimusTask2.Task1196;

import java.util.*;

public class Task1196 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean> (n);

        for (int i = 0; i < n; i ++){
            map.put(in.nextInt(), true);
        }

        int matched = 0;
        int m = in.nextInt();

        for (int i = 0; i < m; i ++){
            if (map.get(in.nextInt()) != null) matched++;
        }
        System.out.println(matched);
        in.close();
    }
}
