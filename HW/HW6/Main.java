import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] nums = { -10000,-5,0,5,10,-10,0 ,10000};

        Arrays.sort(nums);

        if(nums.length<3||nums.length>3000)
        {
            System.out.println("invalid length");
        }
        else if(nums[0]<-10000 || nums[nums.length-1]>10000)
        {
            System.out.println("invalid size for input");
        }
        else
        {

            List<List<Integer>> triplets = threeSum(nums);
            System.out.println(triplets);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums)
    {

        List<List<Integer> > solution = new ArrayList<>();
        List<Integer> threeSum = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                if (nums[i] + nums[j] + nums[k] == 0) {

                    threeSum.add(nums[i]);
                    threeSum.add(nums[j]);
                    threeSum.add(nums[k]);
                    solution.add(threeSum);
                    threeSum = new ArrayList<>();
                    j++;
                    k--;
                }
                else if (nums[i] + nums[j] + nums[k] < 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return solution;
    }
}
