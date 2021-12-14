import java.util.HashMap;
import java.util.*;

public class OverEnroll {
    public String[] popular(String[] data) {
        HashMap<String, Integer> map = new HashMap<>();

        int mn = 0;
        int mx = 0;
        String mnst = "";
        String mxst = "";
        for (String string : data) {
            String[] lmfao = string.split(":");
            if (!map.containsKey(lmfao[0])) {

                map.put(lmfao[0], Integer.parseInt(lmfao[2]));
                mnst = lmfao[0];
                mn = map.get(lmfao[0]);
            }
            else {
                int whatever = map.get(lmfao[0]) + Integer.parseInt(lmfao[2]);
                map.put(lmfao[0], whatever);
                mnst = lmfao[0];
                mn = map.get(lmfao[0]);
            }
        }

        for (String key : map.keySet()) {
                if (map.get(key) < mn) {
                    mnst = key;
                    mn = map.get(key);
                }
                if (map.get(key) > mx) {
                    mxst = key;
                    mx = map.get(key);
                }

            }

        String[] answer = new String[2];

        String min = mnst + ":" + mn;
        String max = mxst + ":" + mx;
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}
