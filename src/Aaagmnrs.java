import java.util.*;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList(phrases));
        ArrayList<String> you = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i < a.size(); i++) {
            String x = a.get(i).replaceAll("\\s+", "");
            x = x.toLowerCase(Locale.ROOT);
            char arr[] = x.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);
            if (!you.contains(sorted)) {
                you.add(sorted);
                ans.add(a.get(i));
            }

        }
        String[] answer = new String[ans.size()];
        ans.toArray(answer);
        return answer;

    }
        }