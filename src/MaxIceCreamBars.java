import java.util.Arrays;

public class MaxIceCreamBars {
    static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            if(coins>=costs[i]){
                count++;
                coins = coins - costs[i];
            }
        }return count;
    }

    public static void main(String[] args) {
        int[] costs = {10,6,8,7,7,8};
        // sabse pehle array sort kar lenge jisse min value wale digit aage ajaye
        // after sorting= 1,1,2,3,4
        // ab inko tab tak add karenge jab tak costs<=coins
        System.out.println(maxIceCream(costs,5));
    }
}
