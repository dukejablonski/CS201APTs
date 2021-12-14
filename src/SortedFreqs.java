import java.util.ArrayList;
import java.util.TreeMap;
import java.util.*;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        TreeMap<String, Integer> tmap = new TreeMap<>();
        for (String a: data) {
            tmap.putIfAbsent(a, 0);
            tmap.put(a, tmap.get(a)+1);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(tmap.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry:: getKey));

        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            ans[i] = list.get(i).getValue();
        }
        return ans;

    }
}