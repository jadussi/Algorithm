import java.io.*;
import java.util.*;

public class Main {

    static int MAX = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ns = br.readLine().split(" ");
        int n = Integer.parseInt(ns[0]);
        long s = Long.parseLong(ns[1]);

        String[] str = br.readLine().split(" ");
        int[] ll = new int[n];
        int[] dp = new int[n+1];
        for(int i = 0; i< n; i++) {
            ll[i] = Integer.parseInt(str[i]);
            dp[i+1] = dp[i] + ll[i];
        }
        int st = 0;
        int ed = 1;
        long ans = 0;
        while(st <= ed && ed <= n) {
            long cal = dp[ed] - dp[st];
            if(cal >= s) {
                if(ed-st < MAX) {
                    MAX = ed-st;
                    ans = ed-st;
                }
                while (cal >= s) {
                    st +=1;
                    cal = dp[ed] - dp[st];
                    if(cal >= s && ed-st < MAX) {
                        MAX = ed-st;
                        ans = ed-st;
                    }
                }
                st +=1;
                ed +=1;
            } else {
                ed += 1;
            }
        }

        System.out.println(ans);

    }

}
