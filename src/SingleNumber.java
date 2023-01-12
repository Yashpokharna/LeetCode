public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        // nums = {2,2,1}
        // wo number print karwana hai jo single time occour hua hai
        int ans = 0;
        for(int x:nums){
            ans ^= x;
        }
        return ans;
    }
}
