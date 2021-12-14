import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        int[] num = new int[(list.length+1)/2];
        List<Integer> k = new ArrayList<>();
        for (int i: list) {
            k.add(i);
        }
        if (list.length%2!=0) {
            k.add(0);
        }
        for(int j=0;  j< k.size(); j+=2) {
                num[j/2] = k.get(j) + k.get(j+1);
            }
        return num;
    }
}