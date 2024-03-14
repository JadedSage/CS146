
public class Main {

    public static void main(String[] args) {
        //TreeNode root = new TreeNode(1,new TreeNode(2, new TreeNode(3),new TreeNode(4)), new TreeNode(8,new TreeNode(5),new TreeNode(6)));
        TreeNode root = new TreeNode(4,new TreeNode(3, new TreeNode(1),null), new TreeNode(8,new TreeNode(5),new TreeNode(9)));
        Boolean solution = isValidBST(root);
        System.out.println(solution);
    }
    private static int minVal = 0;
    public static Boolean isValidBST(TreeNode root) {
        if (root == null)
        {
            return true;
        }
        if (!isValidBST(root.left))
        {
            return false;
        }

        if (minVal >= root.val)
        {
            return false;
        }

        minVal = root.val;

        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }

}
