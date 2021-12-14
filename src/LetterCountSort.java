import java.util.*;

public class LetterCountSort {
    private class v{
        String w;
        int v;

        v(String s, int j){
            w = s;
            v = j;
        }

        public String word() {
            return w;
        }

        public int vowel(){
            return v;
        }
    }
    public String[]sort(String[]list, String specialChars){
        HashMap<String, v> count = new HashMap<>();
        String vw = specialChars;

        for(String s: list){
            String[] a = s.split("");
            int c = 0;
            for(String ss: a){
                if(vw.contains(ss)){
                    c++;
                }
                count.put(s, new v(s, c));
            }
        }

        ArrayList<v> t = new ArrayList<>(count.values());
        Comparator<v> c = Comparator.comparing(v:: vowel);
        Comparator<v> name = Comparator.comparing(v:: word);
        Comparator<v> both = c.thenComparing(name);
        Collections.sort(t,both);

        String[] ans = new String[t.size()];
        for(int j=0;j<ans.length;j++){
            ans[j] = t.get(j).word();
        }

        return ans;
    }
}
