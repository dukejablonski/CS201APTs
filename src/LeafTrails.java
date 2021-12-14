import java.util.*;

public class LeafTrails {
    private TreeMap<Integer, String> tm = new TreeMap<>();
    public String[] trails(TreeNode tree) {
        doWork(tree, "");
        String[]spath = new String[tm.size()];import java.util.*;

        public class LeafTrails {
            private TreeMap<Integer, String> tm = new TreeMap<>();
            public String[] trails(TreeNode tree) {
                doWork(tree, "");
                String[]spath = new String[tm.size()];

                Object[]n = tm.keySet().toArray();

                for(int i = 0; i <spath.length;i++){
                    spath[i] = tm.get(n[i]);
                }
                return spath;
            }

            private void doWork(TreeNode tree, String path){
                if(tree == null){
                    return;
                }
                if(tree.left == null && tree.right == null) {
                    tm.put(tree.info, path);
                    return;
                }
                else{
                    doWork(tree.left, path + "0");
                    doWork(tree.right, path + "1");
                }

            }



        }

        Object[]n = tm.keySet().toArray();

        for(int i = 0; i <spath.length;i++){
            spath[i] = tm.get(n[i]);
        }
        return spath;
    }

    private void doWork(TreeNode tree, String path){
        if(tree == null){
            return;
        }
        if(tree.left == null && tree.right == null) {
            tm.put(tree.info, path);
            return;
        }
        else{
            doWork(tree.left, path + "0");
            doWork(tree.right, path + "1");
        }

    }



}