import java.util.*;

public class FriendScore {
    Map<Integer, Set<Integer>> myGraph;
    public int highestScore(String[] friends) {
        myGraph = new HashMap<>();
        int num = 0;
        for(String f: friends){
            int count = 0;
            for(String c: f.split(""))
            {
                if (c.equals("Y")) {
                    myGraph.putIfAbsent(num, new HashSet());
                    myGraph.get(num).add(count);
                }
                count++;
            }
            num++;
        }

        int max = 0;
        for(int x: myGraph.keySet()){
            int n = twoFriends(x).size();
            if(n>max){
                max = n;
            }
        }
        return max;
    }

    private Set<Integer> twoFriends(int index){
        Set<Integer> set = new TreeSet<>();
        Set<Integer> friends = myGraph.get(index);
        set.addAll(friends);
        for(int friend: friends){
            set.addAll(myGraph.get(friend));
        }
        set.remove(index);
        return set;
    }
}