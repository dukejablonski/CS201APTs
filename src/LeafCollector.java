import java.util.*;

public class LeafCollector {
    public String[] getLeaves(TreeNode tree) {
        int height = maxDepth(tree);
        if(tree == null){
            return null;
        }

        if(tree.left == null && tree.right == null){
            String[] a = {"" + tree.info};
            return a;
        }
       ArrayList<String> p = new ArrayList<>();
        for(int i =0; i <height -1; i++){
            StringBuilder b = new StringBuilder();
            ArrayList<String> a = new ArrayList<>();
            c(tree, a);
            for(String x: a){
                b.append(x + " ");
            }
            if (b.toString().charAt(b.toString().length()-1) == ' ')
                b.setLength(b.length() - 1);
                p.add(b.toString());
        }

        p.add("" + tree.info);

        String[] ans = new String[p.size()];
        for(int i =0; i <ans.length; i++){
            ans[i] = p.get(i);
        }
        return ans;
    }

    private void c(TreeNode root, List<String> l) {
        if(root.left != null) {
           if(isLeaf(root.left)) {
               l.add("" + root.left.info);
               root.left = null;
           }
           else{
               c(root.left,l);
           }
        }
        if(root.right!=null){
            if(isLeaf(root.right)){
                l.add(""+root.right.info);
                root.right = null;
            }
            else{
                c(root.right,l);
            }

        }
    }

    private boolean isLeaf(TreeNode root) {
        if(root.left == null && root.right == null) {
            return true;
        }
        isLeaf(root.left);
        return false;
    }

    int maxDepth(TreeNode node) {
        if(node==null) return 0;
        else{
            int ld = maxDepth(node.left);
            int rd = maxDepth(node.right);

            if(ld>rd){
                return(ld + 1);
            }
            else {
                return(rd+1);
            }
        }
    }
}