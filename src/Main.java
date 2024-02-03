class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 8, 9};
        int target = 7;
        int[] solutions = twoSum(numbers, target);

        for(int i: solutions)
        {
            System.out.println(i);
        }

    }
    public static int[] twoSum(int[] nums, int target) {

        int[] solution = new int[2];
        for(int i = 0; i<nums.length;i++ )
        {
            int key = target - nums[i];
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]==key&&j!=i)
                {
                    solution[0]=i;
                    solution[1]=j;
                    break;
                }
            }
        }
        return solution;
    }
}
