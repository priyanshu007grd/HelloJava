import java.util.*;

public class Main {

    /**
     * Partition modules into three non-empty groups (servers). For a fixed partition,
     * pick one module per server to minimize |d1 - d2| + |d2 - d3|. Among all partitions,
     * maximize that minimum.
     *
     * Optimal partition: global minimum alone on server 1, global maximum alone on server 3,
     * all other modules on server 2. Any d2 between min and max gives |min - d2| + |d2 - max| = max - min.
     */
    public static long getMaxDifficulty(List<Long> difficulty) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (long d : difficulty) {
            min = Math.min(min, d);
            max = Math.max(max, d);
        }
        return max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> difficulty = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            difficulty.add(sc.nextLong());
        }
        System.out.println(getMaxDifficulty(difficulty));
    }
}
