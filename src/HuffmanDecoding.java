import java.util.*;

public class HuffmanDecoding {
    HashMap<String, String> map = new HashMap<>();

    public String decode(String archive, String[] dictionary) {
        map(dictionary);

        String word = "";

        int i = 0;
        for(int j=i; j<archive.length();j++){
            if(map.containsKey(archive.substring(i,j))){
                word+= map.get(archive.substring(i,j));
                        i = j;
            }
        }
        return word;

    }

    private void map(String[] dictionary){
        char key = 'A';
        for(String v: dictionary){
            String k = String.valueOf(key);
            map.put(v, k);
            key++;
        }
    }
}
