import java.util.Arrays;
public class SpecialArrWithXElements {
    static int specialArray(int[] nums) {
        int n = nums.length , count=0;
        for(int i=0;i<=n;i++){
            count = 0;
            for (int num : nums) {
                if (num >= i)
                    count++;
            }
            if(count==i)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }
}
