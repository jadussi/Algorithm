import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] dp = new int[n+1];

        dp[1] = 1;
        if(n >= 2) {
            dp[2] = 2;
        }

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2] ) % 10007;
        }

        System.out.println(dp[n]);

    }
}
