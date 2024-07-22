import java.io.*;
import java.util.*;
public class Main {
    static int[] t;
    static int m;
    static int cal;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] mn = br.readLine().split(" ");

        int n = Integer.parseInt(mn[0]);    // 나무수
        m = Integer.parseInt(mn[1]);    // 나무 길이

        String[] str = br.readLine().split(" ");

        t = new int[n];

        for(int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(t);
        int st = 0;
        int ed = t[n-1];
        cal = 0;

        while(st <= ed) {
            int mid = (st+ed)/2;
            long sum = 0;
            for(int i = 0; i < t.length; i++) {
                if(t[i] > mid) {
                    sum += (t[i] - mid);
                }
            }
            if(sum >= m) {
                cal = mid;
                st = mid+1;
            } else {
                ed = mid-1;
            }
        }
        System.out.println(cal);
    }
}
