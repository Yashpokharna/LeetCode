import java.util.Arrays;

public class MedianOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int n1 = nums1.length;
        int[] nums2 = {3,4};
        int n2 = nums2.length;
        int nums3[] = new int[n1 + n2];
        mergeArrays(nums1,nums2,n1,n2,nums3);
        double ans = (double) median(nums3);
        System.out.println(Arrays.toString(nums3));
        System.out.println(ans);
        // pehle dono arrays ko merge karna hai and then uska median nikalna hai
     }
    public static void mergeArrays(int[] nums1, int[] nums2, int n1, int n2, int[] nums3){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1){
            nums3[k++] = nums1[i++];
        }
        while(j < n2){
            nums3[k++] = nums2[j++];
        }
        Arrays.sort(nums3);
    }
    static double median(int[] nums3){
        int n = nums3.length;
        if(n%2==0){
            return (double) (nums3[(n-1)/2]+nums3[n/2])/2;
        }
        return (double) nums3[n/2];
    }
}
