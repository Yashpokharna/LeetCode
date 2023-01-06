import java.util.Arrays;
public class KthLargestElement {
    static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        // arr = 1,2,3,4,5,6
        System.out.println(findKthLargest(nums,4));
    }
}
