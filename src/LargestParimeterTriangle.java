import java.util.Arrays;

public class LargestParimeterTriangle {
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = n-1; i >1 ; i--) {
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,2};
        // 5 => 2+1+2
        System.out.println(largestPerimeter(nums));


    }
}
