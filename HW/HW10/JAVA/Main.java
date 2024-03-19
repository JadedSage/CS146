import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int counter = 0;
    static int counter2 = 0;
    public static void main(String[] args) {
        //TreeNode root = new TreeNode(4,new TreeNode(3, new TreeNode(1),null), new TreeNode(8,new TreeNode(5),new TreeNode(9)));
        TreeNode root =null;

        check(root);
        if(counter==counter2&&counter<2000) {
            List<List<Integer>> sol = levelOrder(root);
            for (int i = 0; i < sol.size(); i++) {
                System.out.print("[");
                for (int j = 0; j < sol.get(i).size(); j++) {
                    System.out.print(" ");
                    System.out.print(sol.get(i).get(j));
                    System.out.print(" ");
                }
                System.out.print("]");
            }
        }
        else
        {
            System.out.println("not valid input");
        }



    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        if (root == null)
        {
            return sol;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            sol.add(currentLevel);
        }
        return sol;
    }
    public static void check(TreeNode root){
        if(root==null)
        {
            return;
        }
        counter2++;
        if(root.val>=-1000 && root.val<=1000)
        {
            counter++;
        }
        if(root.left!=null&& root.left.val>=-1000 && root.left.val<=1000)
        {
            check(root.left);
        }
        if(root.right!=null && root.right.val>=-1000 && root.right.val<=1000)
        {
            check(root.right);
        }


    }
}
