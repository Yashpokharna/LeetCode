import java.util.Arrays;

public class HeightChecker {
    static int heightChecker(int[] heights) {
        int count =0;
        int length = heights.length;
        int[] expected = new int[length];
        System.arraycopy(heights,0,expected,0,length);
        Arrays.sort(expected);
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};

    }
}
