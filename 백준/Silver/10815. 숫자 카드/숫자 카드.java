import java.io.*;
import java.util.*;

public class Main {
    static int[] mL;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        mL = new int[m];
        String[] mSt = br.readLine().split(" ");

        for(int i = 0; i < m; i++) {
            mL[i] = Integer.parseInt(mSt[i]);
        }

        int n = Integer.parseInt(br.readLine());
        int[] nL = new int[n];
        String[] nSt = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            nL[i] = Integer.parseInt(nSt[i]);
        }

        Arrays.sort(mL);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(bSearch(0,m-1, nL[i])).append(" ");
        }

        System.out.println(sb);
    }

    static int bSearch(int st, int ed, int tar) {

        while(st <= ed) {
            int mid = (st+ed)/2;
            if(mL[mid] == tar){
                return 1;
            } else {
                if(mL[mid] > tar) {
                    ed = mid-1;
                } else {
                    st = mid+1;
                }
            }
        }
        return 0;
    }
}
