import java.util.*;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {

        HashSet<String> A1 = new HashSet(Arrays.asList(player));
        HashSet<String> A2 = new HashSet(Arrays.asList(dictionary));
        A2.retainAll(A1);
        return this.s(A2);
    }

    private int s (HashSet<String> x) {
        int s = 0;
        for (String a : x) {
            s += a.length() * a.length();
        }
        return (s);
    }

    }