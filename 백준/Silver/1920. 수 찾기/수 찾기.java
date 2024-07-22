import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        nl = new int[n];
        String[] nSt = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            nl[i] = Integer.parseInt(nSt[i]);
        }
        Arrays.sort(nl);

        int m = Integer.parseInt(br.readLine());
        int[] ml = new int[m];
        String[] mSt = br.readLine().split(" ");
        for(int i = 0; i < m; i++) {
            ml[i] = Integer.parseInt(mSt[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++) {
            sb.append(bSearch(0, n-1, ml[i])).append("\n");
        }
        System.out.println(sb);
    }

    static int[] nl;
    static int bSearch(int st, int ed, int tar){
        while(st <= ed) {
            int mid = (st+ed)/2;
            if(nl[mid] == tar) {
                return 1;
            } else{
                if(nl[mid] > tar) {
                    ed = mid-1;
                } else {
                    st = mid +1;
                }
            }
        }
        return 0;
    }
}
