import java.util.*;
public class MedalTable {
    public class medals {
        public String country;
        public int g;
        public int s;
        public int b;

        public medals(String d) {
            country = d;
        }

        public int getGold() {
            return g;
        }

        public int getSilver() {
            return s;
        }

        public int getBronze() {
            return b;
        }

        public String getName() {
            return country;
        }

        @Override
        public String toString() {
            return country + " " + g + " " + s + " " + b;
        }
    }

    public String[] generate(String[] results) {
    x    Map<String, medals> map = new HashMap<>();
        for (String s : results) {
            String[] data = s.split(" ");
            for(int i=0; i<3; i++) {
                map.putIfAbsent(data[i], new medals(data[i]));
                }

            map.get(data[0]).g += 1;
            map.get(data[1]).s += 1;
            map.get(data[2]).b += 1;
        }

        ArrayList<medals> list = new ArrayList<>(map.values());

        list.sort(Comparator.comparing(medals::getName));
        list.sort(Collections.reverseOrder(Comparator.comparing(medals::getBronze)));
        list.sort(Collections.reverseOrder(Comparator.comparing(medals::getSilver)));
        list.sort(Collections.reverseOrder(Comparator.comparing(medals::getGold)));

        String[] ans = new String[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i).toString();
        }
        return ans;
    }
}