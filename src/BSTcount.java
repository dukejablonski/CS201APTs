import java.util.*;
public class BSTcount {
    private HashMap<Integer, Long> s = new HashMap<>();

    public long howMany(int[] values) {
        return count(values.length);

    }

    private long count(int size){
        if (s.containsKey(size)) {
            return s.get(size);
        }
        if(size == 0 || size == 1){
            return 1;
        }
        long ret = 0;
        for(int i=0; i< size;i++){
                ret += count(i) * count(size - 1 - i);
            }
        s.put(size, ret);
        return ret;
    }
}