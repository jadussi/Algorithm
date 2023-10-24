import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        int[] arr = new int[cnt+1];
        int[] dp = new int[cnt+1];

        for(int i = 1; i <= cnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = arr[1];

        if(cnt >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        for(int i = 3; i <= cnt; i++) {
            dp[i] = Math.max((Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i]),dp[i-1]);
        }

        System.out.println(dp[cnt]);
    }
}
