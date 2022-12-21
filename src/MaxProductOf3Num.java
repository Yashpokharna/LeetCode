public class MaxProductOf3Num {
    public int maximumProduct(int[] nums) {
        sort(nums);
        int n = nums.length;
        int max_product = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    max_product = Math.max(max_product,
                            nums[i] * nums[j] * nums[k]);

        return max_product;
    }
    static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}