import java.util.*;

public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long sum = 0;
        for (int space : sizes) {
            double x = (double) space;
            double y = clusterSize * Math.ceil(x / clusterSize);
            long z = (long) y;
            sum = sum + z;
        }
        return sum;
    }
}