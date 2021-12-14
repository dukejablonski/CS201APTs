public class OneValue {
    private int c = 0;
    public int count(TreeNode tree) {
        if (tree == null) return 0;
        postorder(tree);
        return c;
    }

    private boolean postorder(TreeNode tree) {
        if (tree.left == null && tree.right == null) {
            c++;
            return true;
        }
        boolean t = true;
        if (tree.left != null) {
            t = postorder(tree.left) && tree.left.info == tree.info && t;
        }
        if (tree.right != null) {
            t = postorder(tree.right) && tree.right.info == tree.info && t;
        }
        if (t) c++;
        return t;
    }

    }
