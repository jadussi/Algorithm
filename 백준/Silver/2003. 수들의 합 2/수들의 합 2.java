import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] mn = br.readLine().split(" ");
        int n = Integer.parseInt(mn[0]);
        int m = Integer.parseInt(mn[1]);

        int[] ll = new int[n];
        String[] tmp = br.readLine().split(" ");
        int[] dp = new int[n+1];
        for(int i = 0; i < n; i++) {
            ll[i] = Integer.parseInt(tmp[i]);
            dp[i+1] = dp[i] + ll[i];
        }

        int st = 0;
        int ed = 1;
        int cnt = 0;
        while(st <= ed && ed <= n) {

            int cal = dp[ed] - dp[st];
            if(cal == m)  {
                cnt +=1;
                st +=1 ;
                ed += 1;
            } else {
                if(cal > m) {
                    st +=1;
                } else {
                    ed +=1;
                }
            }
        }

        System.out.println(cnt);

    }
}
