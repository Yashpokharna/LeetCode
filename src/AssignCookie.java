import java.util.Arrays;

public class AssignCookie {
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cookie=0;
        int answer = 0;
        for(int i=0;i<g.length && cookie<s.length;){
                if(s[cookie]>=g[i]){
                    i++;
                    answer++;
                }
                cookie++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        int ans = findContentChildren(g,s);
        System.out.println(ans);
    }
}
