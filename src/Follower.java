import java.util.*;



public class Follower {
    public int[] follows(String[] words) {

        ArrayList<Integer> intlist = new ArrayList<>();
        ArrayList<String> stringlist = new ArrayList<>(Arrays.asList(words));

        for (int k = 0; k < words.length; k++) {
            for (int j = k+1; j < words.length; j++) {
                if (stringlist.get(k).equals(stringlist.get(j))) {
                    intlist.add(k);
                    break;
                }

            }

        }
        int[] solution = intlist.stream().mapToInt(i -> i).toArray();

        return solution;
    }
}