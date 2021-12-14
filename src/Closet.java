import java.util.*;
public class Closet {
    public String anywhere(String[] list) {
        List<String> k = new ArrayList<>();

        for (String str : list)
            for (String s : str.split(" "))
                k.add(s);

        Collections.sort(k);

        Set<String> hSet = new TreeSet<>();
        for (String x : k)
            hSet.add(x);
String piss = String.join(" ", hSet);
        return piss;
    }
}