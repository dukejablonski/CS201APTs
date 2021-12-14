import java.util.*;
public class LengthSort {
    public String[] rearrange(String[] values){
        String[] ans = Arrays.copyOf(values, values.length);
        Arrays.sort(ans, Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        return ans;
    }
}