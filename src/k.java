public class OneValue {
        public int count(TreeNode tree){
            if (tree == null) {
                return 0;
            }
            int c = count(tree.left) + count(tree.right);
            if (tree.left != null && tree.info != tree.left.info) {
                return c;
            }

            if (tree.right != null && tree.info != tree.right.info) {
                return c;
            }

            return c + 1;
        }
    }