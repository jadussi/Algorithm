import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");

        int[] arr = new int[num];
        int[] dp = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        int max = arr[0];
        dp[0] = arr[0];
        for(int i = 1; i < num; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] += arr[i];
            if(max < dp[i]) max = dp[i];
        }

        System.out.println(max);
    }
}
