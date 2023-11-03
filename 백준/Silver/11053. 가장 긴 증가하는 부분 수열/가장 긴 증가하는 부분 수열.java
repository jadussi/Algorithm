import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[num];
        Integer[] dp = new Integer[num];

        String[] strs = br.readLine().split(" ");

        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num; i++) {
            if(dp[i] == null) {
                dp[i] = 1;
            }
            for(int j = 0; j < i; j++) {
               if(arr[i] > arr[j]) {
                   dp[i] = Math.max(dp[i], dp[j]+1);
               }
            }
            if(max < dp[i]) max = dp[i];
        }

        System.out.println(max);
    }
}
