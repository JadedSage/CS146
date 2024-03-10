import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int counter;
    static HashSet<Integer> unique=new HashSet<Integer>();
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4,new TreeNode(3, new TreeNode(1),null), new TreeNode(8,new TreeNode(5),new TreeNode(9)));
        counter = 0;
        TreeNode p= root.left.left;    // 1
        TreeNode q= root.right.left;   // 5

        check(root);
        if(unique.size()!=counter||counter<=2||counter>=10000)
        {
        }
        else
        {
            TreeNode solution=lowestCommonAncestor(root,p,q);
            System.out.println(solution.val);
        }
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val && root.val>q.val)
        {
            //System.out.println("going right");
            return (lowestCommonAncestor(root.left,p,q));
        }
        if(root.val< p.val && root.val<q.val)
        {
            //System.out.println("going left");
            return (lowestCommonAncestor(root.right,p,q));
        }
        return root;

    }
    /*
    This is the checking the constraints
     */
    public static void check(TreeNode root){

        if(root.val>-1000000000 && root.val<1000000000)
        {
            counter++;
        }

        unique.add(root.val);

        if(root.left!=null&& root.left.val>-1000000000 && root.left.val<1000000000)
        {
            check(root.left);
        }

        if(root.right!=null && root.right.val>-1000000000 && root.right.val<1000000000)
        {
            check(root.right);
        }


    }

}