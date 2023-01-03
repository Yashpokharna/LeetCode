import java.util.Arrays;
public class SortArrayByIncFreq {
    public static int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums[nums.length]){
                count++;
            }
        }return new int[]{count};

    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,3,2};
        // 1,2,2,3,3 after sorting
        // ab freq count krni hai

    }
}
