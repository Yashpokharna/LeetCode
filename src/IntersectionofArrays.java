import java.util.Arrays;
public class IntersectionofArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        // output = 2,2
        int[] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersect(int[] nums1, int[] nums2) {
        for (int i = 0; i <= nums1.length; i++) {
            for (int j = 1; j < nums2.length; j++) {
                if(nums1[i] < nums2[j]){
                    i++;
                }else if(nums1[i]>nums2[j]) {
                    j++;
                }
            }
        }
        return nums1;
    }
}