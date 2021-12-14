import java.util.*;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        LinkedHashSet<String> joy = new LinkedHashSet<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].length() >= minLength) {
                joy.add(list[i]);
            }
        }
        String[] jiayin = new String[joy.size()];
       joy.toArray(jiayin);
       return jiayin;
    }
}