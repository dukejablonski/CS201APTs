import java.util.*;

public class OddishTreeCount {
    ArrayList<Integer>answer = new ArrayList<>();
    public int count(TreeNode tree){
        t(tree);
        int c = 0;
        for(int i =0;i<answer.size();i++){
            if(answer.get(i)%2 ==1){
                c++;
            }
        }
        return c;

    }

    private void t(TreeNode root){
        if(root!= null){
            answer.add(root.info);
            t(root.left);
            t(root.right);
        }
    }
}
