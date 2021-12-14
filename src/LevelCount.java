import java.util.*;

public class LevelCount {
    private ArrayList<Integer> list = new ArrayList<>();
    public int count(TreeNode t, int level) {
        n(t, 0, level);
        return list.size();

    }
    private void n(TreeNode x, int at, int level) {
        if(x == null){
            return;
        }
        if(at == level){
            list.add(at);
            return;
        }
        at+=1;

        n(x.left, at, level);
        n(x.right, at, level);
    }
}