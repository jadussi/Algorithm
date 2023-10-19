import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        dp = new int[num+1];
        System.out.println(recur(num));
    }
    static int recur(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <=n; i++) {
            dp[i] = (dp[i-1]+ dp[i-2]) % 15746;
        }
        return dp[n];
    }
}
