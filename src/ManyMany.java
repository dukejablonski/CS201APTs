
import java.lang.reflect.Array;
import java.util.*;



public class ManyMany {
    public String[] filter(String[] data) {
        ArrayList<String> answer = new ArrayList<>();



        for (int i = 0; i < data.length; i++) {
            String[] d = data[i].split(" ");
            ArrayList<String> a = new ArrayList<>(Arrays.asList(d));
            ArrayList<String> p = new ArrayList<>();

            for (int k = 0; k < a.size(); k++) {
                if (Collections.frequency(a, a.get(k)) > 1 && !p.contains(a.get(k))) {
                    p.add(a.get(k));
                }

            }
            Collections.sort(p);
            String ans = String.join(" ", p);
            answer.add(ans);
        }
        String[] toret = new String[answer.size()];
        answer.toArray(toret);
        return toret;
    }

    }