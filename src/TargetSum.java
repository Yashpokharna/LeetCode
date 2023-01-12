public class TargetSum {
    public int[] findTargetSumWays(int[] nums, int target) {
//        calculate(nums,0,0,S);
        return new int[]{count};
    }
    int count = 0;
    public void calculate(int[]nums,int pos,int sum,int S)
    {
        if(pos==nums.length)
        {
            if(sum==S)
                count++;
            return;
        }
        calculate(nums,pos+1,sum+nums[pos],S);
        calculate(nums,pos+1,sum-nums[pos],S);
    }
}
