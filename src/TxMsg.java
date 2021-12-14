import java.util.*;

public class TxMsg {
    public String getMessage(String original) {
        String[] data = original.split(" ");
        String[] ret = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            ret[i] = con(data[i]);
        }
        return String.join(" ", ret);
    }

    private String con(String word) {
        char[] cons = "bcdfghjklmnpqrstvwxyz".toCharArray();
        for (char ch : cons) {
            if(word.contains(String.valueOf(ch))) {
                break;
            }
            if(ch == 'z') {
                return word;
            }
        }


        StringBuilder output = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (i == 0 && !isVowel(word.charAt(0))) {
                output.append(word.charAt(0));
                continue;
            } else if (i == 0) {
                continue;
            }
            if (isVowel(word.charAt(i - 1)) && !isVowel(word.charAt(i))) {
                output.append(word.charAt(i));
            }
        }
        return output.toString();
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        return false;
    }
}