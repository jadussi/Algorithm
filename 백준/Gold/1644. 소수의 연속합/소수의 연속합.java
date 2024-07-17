import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        boolean[] isPrime = new boolean[n+1];
        
        Arrays.fill(isPrime, true);
        
        isPrime[0] = false; isPrime[1] = false;
        // 소수 판별하기

        for(int i = 2; i*i <= n; i++) {
            if(isPrime[i]) {
                for(int j = i*i ; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]){
                arr.add(i);
            }
        }

        int[] dp = new int[arr.size()+1];
        for(int i = 1; i <= arr.size(); i++) {
            dp[i] = dp[i-1] + arr.get(i-1);
        }

        int ans = 0;
        int st = 0;
        int ed = 0;
        while (true) {

            if(st >= dp.length || ed >= dp.length) break;

            if(st == ed) {
                if(dp[st] == n) {
                    ans+=1;
                    st +=1;
                    ed+=1;
                } else {
                    if(dp[st] > n) {
                        st +=1;
                    } else {
                        ed += 1;
                    }
                }
            } else {
                int tmp = dp[ed] - dp[st];
                if(tmp == n) {
                    ans +=1;
                    st +=1;
                    ed +=1;
                } else {
                    if(tmp > n) {
                        st +=1;
                    } else {
                        ed += 1;
                    }
                }
            }
        }
        System.out.println(ans);

    }
}
