import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        TreeMap<String, Integer> tmap = new TreeMap<>();
        for (String a: data) {
            tmap.putIfAbsent(a, 0);
            tmap.put(a, tmap.get(a)+1);
        }
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(tmap.entrySet());
        Collections.sort(list, Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue)));

        String[] ans = new String[list.size()];
        for(int i=0;i<list.size();i++) {
            ans[i] = list.get(i).getKey();
        }





        return ans;
    }
}