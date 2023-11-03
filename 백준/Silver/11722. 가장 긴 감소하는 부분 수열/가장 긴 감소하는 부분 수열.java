import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[num];
        Integer[] dp = new Integer[num];

        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int max = Integer.MIN_VALUE;
        int cnt = Integer.MIN_VALUE;
        int tIdx = 0;
        for(int i = 0; i < num; i++) {
            if(dp[i] == null) {
                dp[i] = 1;
            }
            for(int j = 0; j <= i; j++) {
                if(arr[j] > arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            if(cnt < dp[i]) cnt = dp[i];
        }

        System.out.println(cnt);
    }
}
