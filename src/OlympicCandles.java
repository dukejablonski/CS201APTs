import java.util.*;

public class OlympicCandles{
    public int numberOfNights(int[] candles){
        ArrayList<Integer> c = new ArrayList<>();
        for(int l: candles){
            c.add(l);
        }
        Collections.sort(c, Collections.reverseOrder());
        int n = 1;
        while(true){
            for(int i = 0; i<n; i++){
                c.set(i, c.get(i)-1);
            }
            Collections.sort(c, Collections.reverseOrder());
            if(n == c.size() || c.get(n)==0){
                return n;
            }
            n++;
        }
    }
}