import java.io.*;
import java.util.*;

public class Main {
    
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] nStr = br.readLine().split(" ");
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i< n ; i++) {
            int tmp = Integer.parseInt(nStr[i]);
            hm.put(tmp,hm.getOrDefault(tmp, 0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        String[] mStr = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m ; i++) {
            int tmp = Integer.parseInt(mStr[i]);
            int ans = hm.getOrDefault(tmp,0);
            sb.append(ans).append(" ");
        }

        System.out.println(sb);
    }
}