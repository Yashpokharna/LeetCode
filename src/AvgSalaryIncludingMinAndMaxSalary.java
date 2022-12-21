import java.util.Arrays;

public class AvgSalaryIncludingMinAndMaxSalary {
    static double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        int sum = 0;
        for (int i = 1; i < n-1; i++) {
            sum += salary[i];
        }
        return sum/((n-2)*1.0);
    }


    public static void main(String[] args) {
        int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        // 1000 2000 3000 4000
        // max and mix ko remove karna hai
        int ans = (int) average(salary);
        System.out.println(ans);
    }
}
