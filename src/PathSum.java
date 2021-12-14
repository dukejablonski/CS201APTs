import java.util.ArrayList;

public class PathSum {
    private ArrayList<Integer> s= new ArrayList<>();
    public int hasPath(int target, TreeNode tree){

        if (tree == null) {
            return 0;
        }

        sum(tree, 0);

        for(int n: s) {
            if (n == target) {
                return 1;
            }
        }
        return 0;
    }

    private void sum (TreeNode x, int sum) {
        if (x == null) {
            return;
        }
        if(x.left == null && x.right == null){
            sum = sum + x.info;
            s.add(sum);
            return;
        }

        sum+= x.info;

        sum(x.left, sum);
        sum(x.right, sum);
    }
}