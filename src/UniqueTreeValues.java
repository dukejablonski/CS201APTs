import java.util.*;

public class UniqueTreeValues {
    private ArrayList<Integer> as = new ArrayList<>();

    public int[] unique(TreeNode root) {
        inOrder(root);

        Collections.sort(as);

        int[]ret = new int[as.size()];

        for(int i =0; i< as.size(); i++){
            ret[i] = as.get(i);
        }
        return ret;

        }

    public void inOrder(TreeNode root){
        if (root != null){
            inOrder(root.left);
            if(!as.contains(root.info)){
                as.add(root.info);
            }
            inOrder(root.right);
        }
    }
}