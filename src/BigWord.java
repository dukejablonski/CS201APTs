import java.util.*;
public class BigWord {
    public String most(String[] sentences) {
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].toLowerCase();
        }
        String words = sentences.toString();
        words = words.split(" ");
        List<String> joy = Arrays.asList(sentences);


        return sentences[0];
    }
}