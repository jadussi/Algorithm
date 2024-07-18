import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] ll = new int[n][2];
        for(int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");

            ll[i][0] = Integer.parseInt(st[0]);
            ll[i][1] = Integer.parseInt(st[1]);
        }

        Arrays.sort(ll, (a,b) -> {
           if(a[0]== b[0]) {
               return a[1] - b[1];
           }
           return a[0]-b[0];
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(ll[i][0]).append(" ").append(ll[i][1]).append("\n");
        }

        System.out.println(sb);

    }
}
