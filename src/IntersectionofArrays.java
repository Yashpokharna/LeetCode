public class IntersectionofArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        // output = 2,2

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        for (int i = 0; i <= nums1.length; i++) {
            for (int j = 1; j < nums2.length; j++) {
                if(nums1[i] < nums2[j]){
                    i++;
                }else if(nums1[i]>nums2[j]){
                    j++;
                }
                else{

                }
            }
        }
        return nums1;
    }
}