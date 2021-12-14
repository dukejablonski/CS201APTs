import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        String s = "";
        int max = 1;
        for(String word : strands) {
            int c = count(word, nuc);
            if (c > max || c == max && word.length() > s.length()) {
                s = word;
                max = c;
            }
        }
        return (s);
    }
    private int count(String word, String nuc) {
        int x = 0;
        for (char ch : word.toCharArray())
            if (ch == nuc.charAt(0)) x += 1;
        return x;
    }

}