public class MedianOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        // 2+3/2 = 2.5
        int n = arr.length;
        System.out.println(median(arr,n));
    }
    static double median(int[] arr, int n){
        if(n%2==0){
            return (double) (arr[(n-1)/2]+arr[n/2])/2;
        }
        return (double) arr[n/2];
    }
}
