import java.util.Arrays;
import java.util.EnumSet;

public class SortIntByTheNoOf1Bits {
    static int[] sortByBits(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end = nums.length-1;
        while(start<end){
            if (nums[end] % 2 == 1 && nums[start] % 2 == 0) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }if(nums[start]%2==0){
                ++start;
            }if(nums[end]%2==1){
                --end;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8};
        int[]ans=sortByBits(nums);
        System.out.println(Arrays.toString(ans));

    }
}
