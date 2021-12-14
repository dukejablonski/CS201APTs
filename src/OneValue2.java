public class OneValue2 {

    int ct = 0;
    public int count(TreeNode tree){

        boolean c(TreeNode tree, Count c)
        {
            if (tree == null)
                return true;

            boolean left = c(node.left, c);
            boolean right = c(node.right, c);

            // If any of the subtrees is not singly, then this
            // cannot be singly.
            if (left == false || right == false)
                return false;

            // If left subtree is singly and non-empty, but data
            // doesn't match
            if (tree.left != null && tree.info != tree.left.info)
                return false;

            // Same for right subtree
            if (tree.info != null && tree.info != tree.right.info)
                return false;

            // If none of the above conditions is true, then
            // tree rooted under root is single valued, increment
            // count and return true.
            c++;
            return true;
        }

        // This function mainly calls countSingleRec()
        // after initializing count as 0
        int countSingle()
        {
            return countSingle(root);
        }

        int countSingle(Node node)
        {
            // Recursive function to count
            countSingleRec(node, ct);
            return ct.count;
        }
    }
}
