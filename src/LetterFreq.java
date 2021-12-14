import java.util.*;

public class LetterFreq {
    public String findFreqs(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] davidpenis = "abcdefghijklmnopqrstuvwxyz".toCharArray();

                for(int i=0; i < davidpenis.length; i++) {
                    map.put(davidpenis[i], 0);
                }

                for(int k=0; k <words.length; k++) {
                    char[] wordsplit = words[k].replaceAll(" ","").toCharArray();
                    for(char penis: wordsplit) {
                        int bigballs = map.get(penis) + 1;
                        map.put(penis, bigballs);
                    }
                }


                String bootyhole = "";
                for(int bigdickhole=0; bigdickhole<davidpenis.length; bigdickhole++) {
                    bootyhole+= map.get(davidpenis[bigdickhole]);
                    if(davidpenis[bigdickhole] != 'z') {
                        bootyhole+=":";
                    }
        }
        return bootyhole;
    }
}